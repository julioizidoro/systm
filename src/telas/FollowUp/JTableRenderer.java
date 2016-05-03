/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.FollowUp;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Wolverine
 */
public class JTableRenderer extends DefaultTableCellRenderer  {  
  
    protected void setValue(Object value){  
  
        if (value instanceof ImageIcon){  
  
            if (value != null){  
                ImageIcon d = (ImageIcon) value;  
                setIcon(d);  
            } else{  
                setText("");  
                setIcon(null);  
            }  
              
        } else {  
            super.setValue(value);  
        }  
          
    }// fim da função 
}
