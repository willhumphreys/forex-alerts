package uk.co.threebugs;

import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "Rate")
public class Rate implements Serializable {

    @XmlAttribute(name = "Symbol")
    private String symbol;

    @XmlElement(name = "Bid")
    private double bid;

    @XmlElement(name = "Ask")
    private double ask;

    @XmlElement(name = "High")
    private double high;

    @XmlElement(name = "Low")
    private double low;

    @XmlElement(name = "Direction")
    private int direction;

    @XmlElement(name = "Last")
    private String last;

    public Rate() {
    }

    public String getSymbol() {
        return symbol;
    }

    public double getBid() {
        return bid;
    }

    public double getAsk() {
        return ask;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public int getDirection() {
        return direction;
    }

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
