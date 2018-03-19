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
    @SerializedName("txs")
    @Expose
    private List<Tx> txs = null;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Tx> getTxs() {
        return txs;
    }

    public void setTxs(List<Tx> txs) {
        this.txs = txs;
    }

}