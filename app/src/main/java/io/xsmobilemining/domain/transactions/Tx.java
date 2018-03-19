package io.xsmobilemining.domain.transactions;

/**
 * Created by Who Dat on 3/18/2018.
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tx {

    @SerializedName("txid")
    @Expose
    private String txid;
    @SerializedName("from_green_address")
    @Expose
    private Boolean fromGreenAddress;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("confirmations")
    @Expose
    private Integer confirmations;
    @SerializedName("amounts_received")
    @Expose
    private List<AmountsReceived> amountsReceived = null;
    @SerializedName("senders")
    @Expose
    private List<String> senders = null;
    @SerializedName("confidence")
    @Expose
    private Double confidence;
    @SerializedName("propagated_by_nodes")
    @Expose
    private Object propagatedByNodes;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public Boolean getFromGreenAddress() {
        return fromGreenAddress;
    }

    public void setFromGreenAddress(Boolean fromGreenAddress) {
        this.fromGreenAddress = fromGreenAddress;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public List<AmountsReceived> getAmountsReceived() {
        return amountsReceived;
    }

    public void setAmountsReceived(List<AmountsReceived> amountsReceived) {
        this.amountsReceived = amountsReceived;
    }

    public List<String> getSenders() {
        return senders;
    }

    public void setSenders(List<String> senders) {
        this.senders = senders;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Object getPropagatedByNodes() {
        return propagatedByNodes;
    }

    public void setPropagatedByNodes(Object propagatedByNodes) {
        this.propagatedByNodes = propagatedByNodes;
    }

}
