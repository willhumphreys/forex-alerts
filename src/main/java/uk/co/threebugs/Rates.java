package uk.co.threebugs;

import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Rates")
public class Rates {

    @XmlElement(name = "Rate")
    private List<Rate> rates = null;

    public List<Rate> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("rates", rates)
                .toString();
    }
}
