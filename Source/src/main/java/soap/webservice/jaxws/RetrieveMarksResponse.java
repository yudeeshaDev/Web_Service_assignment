
package soap.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.0
 * Wed May 17 16:12:31 IST 2023
 * Generated source version: 3.6.0
 */

@XmlRootElement(name = "retrieveMarksResponse", namespace = "http://webservice.soap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveMarksResponse", namespace = "http://webservice.soap/")

public class RetrieveMarksResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}
