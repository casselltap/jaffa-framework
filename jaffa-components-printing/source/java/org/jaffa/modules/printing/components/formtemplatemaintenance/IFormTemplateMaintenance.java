// .//GEN-BEGIN:_1_be
/******************************************************
 * Code Generated From JAFFA Framework Default Pattern
 * 
 * The JAFFA Project can be found at http://jaffa.sourceforge.net
 * and is available under the Lesser GNU Public License
 ******************************************************/ 
package org.jaffa.modules.printing.components.formtemplatemaintenance;

import org.jaffa.exceptions.ApplicationExceptions;
import org.jaffa.exceptions.FrameworkException;
import org.jaffa.modules.printing.components.formtemplatemaintenance.dto.*;
// .//GEN-END:_1_be
// Add additional imports//GEN-FIRST:_imports




// .//GEN-LAST:_imports
// .//GEN-BEGIN:_2_be
/** Interface for FormTemplateMaintenance components.
 */
public interface IFormTemplateMaintenance {

    /** This method is used to perform prevalidations before creating a new instance of FormTemplate.
     * @param input The new values for the domain object.
     * @throws ApplicationExceptions This will be thrown if the input contains invalid data.
     * @throws FrameworkException Indicates some system error.
     * @return The object details.
     */
    public FormTemplateMaintenancePrevalidateOutDto prevalidateCreate(FormTemplateMaintenanceCreateInDto input) throws FrameworkException, ApplicationExceptions;

    /** Persists a new instance of FormTemplate.
     * @param input The new values for the domain object.
     * @throws ApplicationExceptions This will be thrown if the input contains invalid data.
     * @throws FrameworkException Indicates some system error.
     * @return The object details.
     */
    public FormTemplateMaintenanceRetrieveOutDto create(FormTemplateMaintenanceCreateInDto input) throws FrameworkException, ApplicationExceptions;

    /** Returns the details for FormTemplate.
     * @param input The criteria based on which an object will be retrieved.
     * @throws ApplicationExceptions This will be thrown if the criteria contains invalid data.
     * @throws FrameworkException Indicates some system error.
     * @return The object details. A null indicates, the object was not found.
     */
    public FormTemplateMaintenanceRetrieveOutDto retrieve(FormTemplateMaintenanceRetrieveInDto input) throws FrameworkException, ApplicationExceptions;
    
    /** This method is used to perform prevalidations before updating an existing instance of FormTemplate.
     * @param input The new values for the domain object.
     * @throws ApplicationExceptions This will be thrown if the input contains invalid data.
     * @throws FrameworkException Indicates some system error.
     * @return The object details.
     */
    public FormTemplateMaintenancePrevalidateOutDto prevalidateUpdate(FormTemplateMaintenanceUpdateInDto input) throws FrameworkException, ApplicationExceptions;

    /** Updates an existing instance of FormTemplate.
     * @param input The new values for the domain object.
     * @throws ApplicationExceptions This will be thrown if the input contains invalid data.
     * @throws FrameworkException Indicates some system error.
     * @return The object details.
     */
    public FormTemplateMaintenanceRetrieveOutDto update(FormTemplateMaintenanceUpdateInDto input) throws FrameworkException, ApplicationExceptions;

    /** Deletes an existing instance of FormTemplate.
     * @param input The key values for the domain object to be deleted.
     * @throws ApplicationExceptions This will be thrown if the input contains invalid data.
     * @throws FrameworkException Indicates some system error.
     */
    public void delete(FormTemplateMaintenanceDeleteInDto input) throws FrameworkException, ApplicationExceptions;

    /**
     * This should be invoked, when done with the component.
     */
    public void destroy();

    // .//GEN-END:_2_be
    // All the custom code goes here //GEN-FIRST:_custom






    // .//GEN-LAST:_custom
}
