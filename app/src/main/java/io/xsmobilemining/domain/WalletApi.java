package io.xsmobilemining.domain;

import io.xsmobilemining.domain.transactions.Transaction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This interface is created to be a client for
 * block.io rest calls for accessing customer account
 * information.
 * Created by Who Dat on 3/17/2018.
 */

public interface WalletApi {

    //  TRANSACTIONS
    @GET("get_transactions")
    Call<Transaction> getTransactions(@Query("api_key") String apiKey, @Query("type") String requestType );

    @GET("get_transactions")
    Call<Transaction> getTransactionsBeforeTx(@Query("api_key") String apiKey, @Query("type") String requestType, @Query("before_tx") String txid );

    @GET("get_transactions")
    Call<Transaction> getTransactionsBeforeTx(@Query("api_key") String apiKey, @Query("type") String requestType, @Query("before_tx") String txid, @Query("labels") String labels );

    @GET("get_transactions")
    Call<Transaction> getTransactionsByAddress(@Query("api_key") String apiKey, @Query("type") String requestType, @Query("addresses") String address);

    @GET("get_transactions")
    Call<Transaction> getTransactionsByUserId(@Query("api_key") String apiKey, @Query("type") String requestType, @Query("user_ids") String userIds);

    @GET("get_transactions")
    Call<Transaction> getTransactionsByLabel(@Query("api_key") String apiKey, @Query("type") String requestType, @Query("labels") String lables);

    // BALANCE
    /*Returns the (unarchived) addresses, their labels, user ids, and balances on your account*/
    @GET("get_balance")
    Call<Transaction> getAccountBalance(@Query("api_key") String apiKey);

    @GET("get_address_balance")
    Call<Transaction> getAddressBalanceByAddress(@Query("api_key") String apiKey, @Query("addresses") String address);

    @GET("get_address_balance")
    Call<Transaction> getAddressBalanceByLabel(@Query("api_key") String apiKey, @Query("labels") String labels);

    // ADDRESSES
   @GET("get_my_addresses_without_balances")
    Call<Transaction> getMyAddressesWithoutBalances(@Query("api_key") String apiKey);

   @GET("get_address_by_label")
   Call<Transaction> getAddressByLabel(@Query("api_key") String apiKey, @Query("label") String label);
}
