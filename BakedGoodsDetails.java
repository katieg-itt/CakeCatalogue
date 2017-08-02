package cakecatalogue;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author katie
 */
public class BakedGoodsDetails {
    private Map details;
    
    public BakedGoodsDetails(Map details) {
        if(details == null) {
            this.details = new HashMap();
        } else {
            this.details = new HashMap(details);
        }
    }
    
    public Object getDetail(String name) {
        return details.get(name);
    }
    
    public Map getDetails() {
        return details;
    }
    
    public boolean matches(BakedGoodsDetails otherDetails) {
        for(Iterator i = otherDetails.getDetails().keySet().iterator(); i.hasNext();) {
            String name = (String)i.next();
            if(details.get(name)==null || !details.get(name).equals(otherDetails.getDetail(name))) {
                return false;
            }
        }
        return true;
    }
}
