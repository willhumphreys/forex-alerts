package uk.co.threebugs;

import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Rate")
public class Rate {

    private String symbol;
    private double bid;
    private double ask;
    private double high;
    private double low;
    private int direction;
    private String last;

    public Rate() {
    }

    @XmlAttribute(name = "Symbol")
    public String getSymbol() {
        return symbol;
    }

    @XmlElement(name = "Bid")
    public double getBid() {
        return bid;
    }

    @XmlElement(name = "Ask")
    public double getAsk() {
        return ask;
    }

    @XmlElement(name = "High")
    public double getHigh() {
        return high;
    }

    @XmlElement(name = "Low")
    public double getLow() {
        return low;
    }

    @XmlElement(name = "Direction")
    public int getDirection() {
        return direction;
    }

    @XmlElement(name = "Last")
    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("symbol", symbol)
                .add("bid", bid)
                .add("ask", ask)
                .add("high", high)
                .add("low", low)
                .add("direction", direction)
                .add("last", last)
                .toString();
    }
}
