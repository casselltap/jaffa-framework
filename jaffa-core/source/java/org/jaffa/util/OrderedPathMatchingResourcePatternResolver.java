/*
 * ====================================================================
 * JAFFA - Java Application Framework For All
 *
 * Copyright (C) 2014 JAFFA Development Group
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Redistribution and use of this software and associated documentation ("Software"),
 * with or without modification, are permitted provided that the following conditions are met:
 * 1.	Redistributions of source code must retain copyright statements and notices.
 *         Redistributions must also contain a copy of this document.
 * 2.	Redistributions in binary form must reproduce the above copyright notice,
 * 	this list of conditions and the following disclaimer in the documentation
 * 	and/or other materials provided with the distribution.
 * 3.	The name "JAFFA" must not be used to endorse or promote products derived from
 * 	this Software without prior written permission. For written permission,
 * 	please contact mail to: jaffagroup@yahoo.com.
 * 4.	Products derived from this Software may not be called "JAFFA" nor may "JAFFA"
 * 	appear in their names without prior written permission.
 * 5.	Due credit should be given to the JAFFA Project (http://jaffa.sourceforge.net).
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 */
package org.jaffa.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * This class is extension of the spring PathMatchingResourcePatternResolver.
 * 
 * This class provide the default Asc order of the resources collection.
 * 
 */
public class OrderedPathMatchingResourcePatternResolver extends PathMatchingResourcePatternResolver {

	private static final Logger log = Logger.getLogger(OrderedPathMatchingResourcePatternResolver.class);

	private boolean ascending = true;

	public boolean isAscending() {
		return ascending;
	}

	public void setAscending(boolean ascending) {
		this.ascending = ascending;
	}

	private OrderedPathMatchingResourcePatternResolver() {
		super();
	}

	public OrderedPathMatchingResourcePatternResolver(ClassLoader classLoader) {
		super(classLoader);
	}

	public OrderedPathMatchingResourcePatternResolver(ResourceLoader resourceLoader) {
		super(resourceLoader);
	}

	/* Singleton instance of this class */
	private static volatile OrderedPathMatchingResourcePatternResolver resolver;

	/**
	 * Creates an instance of OrderedPathMatchingResourcePatternResolver, if not already instantiated.
	 * @return An instance of the OrderedPathMatchingResourcePatternResolver.
	 */
	public static OrderedPathMatchingResourcePatternResolver getInstance() {
		if (resolver == null)
			createResolverInstance();
		return resolver;
	}

	private static synchronized void createResolverInstance() {
		if (resolver == null) {
			resolver = new OrderedPathMatchingResourcePatternResolver();
			if (log.isDebugEnabled())
				log.debug("An instance of the ResourceFinder has been created");
		}
	}

	/**
	 * Custom comparator to sort the result based on asc or desc. Default Asc
	 */
	protected final Comparator<Resource> resourceComparator = new Comparator<Resource>() {
		public int compare(Resource r1, Resource r2) {
			int compareResult = 0;
			try {
				compareResult = r1.getURL().getPath().compareTo(r2.getURL().getPath());
			} catch (IOException io) {
				throw new RuntimeException("Error in resource comparator", io);
			}
			return ascending ? compareResult : -compareResult;
		}
	};
	
	@Override
	public Resource[] getResources(String locationPattern) throws IOException {
		Resource[] resources = super.getResources(locationPattern);
		if(resources!=null){
			List<Resource> resourceList = Arrays.asList(resources);
			Collections.sort(resourceList, resourceComparator);
			return resourceList.toArray(new Resource[resourceList.size()]);
		}
		return resources;
	}
}
