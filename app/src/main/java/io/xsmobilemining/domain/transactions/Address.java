package io.xsmobilemining.domain.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Who Dat on 3/19/2018.
 */

public class Address {

    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("label")
    @Expose
    private String label;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
