// .//GEN-BEGIN:_1_be
/******************************************************
 * Code Generated From JAFFA Framework Default Pattern
 * 
 * The JAFFA Project can be found at http://jaffa.sourceforge.net
 * and is available under the Lesser GNU Public License
 ******************************************************/ 
package org.jaffa.modules.printing.components.formgroupmaintenance.dto;

import java.util.*;
import org.jaffa.components.dto.HeaderDto;
// .//GEN-END:_1_be
// Add additional imports//GEN-FIRST:_imports




// .//GEN-LAST:_imports
// .//GEN-BEGIN:_2_be
/** The input for the FormGroupMaintenance.
 */
public class FormGroupMaintenanceDeleteInDto {

    /** Holds value of property headerDto. */
    private HeaderDto headerDto;

    /** Holds value of property performDirtyReadCheck. */
    private Boolean performDirtyReadCheck;

    /** Holds value of property formName. */
    private java.lang.String formName;


    /** Getter for property headerDto.
     * @return Value of property headerDto.
     */
    public HeaderDto getHeaderDto() {
        return headerDto;
    }
    
    /** Setter for property headerDto.
     * @param headerDto New value of property headerDto.
     */
    public void setHeaderDto(HeaderDto headerDto) {
        this.headerDto = headerDto;
    }
    
    /** Getter for property performDirtyReadCheck.
     * @return Value of property performDirtyReadCheck.
     */
    public Boolean getPerformDirtyReadCheck() {
        return performDirtyReadCheck;
    }
    
    /** Setter for property performDirtyReadCheck.
     * @param performDirtyReadCheck New value of property performDirtyReadCheck.
     */
    public void setPerformDirtyReadCheck(Boolean performDirtyReadCheck) {
        this.performDirtyReadCheck = performDirtyReadCheck;
    }


    /** Getter for property formName.
     * This property is used when performing the dirty read check.
     * @return Value of property formName.
     */
    public java.lang.String getFormName() {
        return formName;
    }
    
    /** Setter for property formName.
     * This property is used when performing the dirty read check.
     * @param formName New value of property formName.
     */
    public void setFormName(java.lang.String formName) {
        if (formName == null || formName.length() == 0)
            this.formName = null;
        else
            this.formName = formName;
    }


    /** Returns the debug information
     * @return The debug information
     */
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("<FormGroupMaintenanceDeleteInDto>");
        buf.append("<headerDto>"); if (headerDto != null) buf.append( headerDto.toString() ); buf.append("</headerDto>");
        buf.append("<performDirtyReadCheck>"); if (performDirtyReadCheck != null) buf.append( performDirtyReadCheck.toString() ); buf.append("</performDirtyReadCheck>");

        buf.append("<formName>"); if (formName != null) buf.append(formName); buf.append("</formName>");

        buf.append("</FormGroupMaintenanceDeleteInDto>");
        return buf.toString();
    }
    
    // .//GEN-END:_2_be
    // All the custom code goes here //GEN-FIRST:_custom






    // .//GEN-LAST:_custom
}
