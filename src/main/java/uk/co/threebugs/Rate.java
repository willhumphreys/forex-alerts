package uk.co.threebugs;

import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Rate")
public class Rate {

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

    public Rate(String symbol, double bid, double ask, double high, double low, int direction, String last) {
        this.symbol = symbol;
        this.bid = bid;
        this.ask = ask;
        this.high = high;
        this.low = low;
        this.direction = direction;
        this.last = last;
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
