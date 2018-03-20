package io.xsmobilemining.domain.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Who Dat on 3/18/2018.
 */

public class Data {

    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("txs")
    @Expose
    private List<Tx> txs = null;
    @SerializedName("available_balance")
    @Expose
    private String availableBalance;
    @SerializedName("pending_received_balance")
    @Expose
    private String pendingReceivedBalance;
    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("address")
    @Expose
    private String address;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Tx> getTxs() {
        return txs;
    }

    public void setTxs(List<Tx> txs) {
        this.txs = txs;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getPendingReceivedBalance() {
        return pendingReceivedBalance;
    }

    public void setPendingReceivedBalance(String pendingReceivedBalance) {
        this.pendingReceivedBalance = pendingReceivedBalance;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}