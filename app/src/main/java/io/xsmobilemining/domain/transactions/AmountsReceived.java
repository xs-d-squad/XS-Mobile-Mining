package io.xsmobilemining.domain.transactions;

/**
 * Created by Who Dat on 3/18/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmountsReceived {

    @SerializedName("recipient")
    @Expose
    private String recipient;
    @SerializedName("amount")
    @Expose
    private String amount;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
