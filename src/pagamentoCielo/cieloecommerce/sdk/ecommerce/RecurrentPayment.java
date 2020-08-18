package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class RecurrentPayment {
    @SerializedName("RecurrentPaymentId")
    private String recurrentPaymentId;

    @SerializedName("NextRecurrency")
    private String nextRecurrency;

    @SerializedName("StartDate")
    private String startDate;

    @SerializedName("EndDate")
    private String endDate;

    @SerializedName("Interval")
    private Interval interval;

    @SerializedName("Amount")
    private Integer amount;

    @SerializedName("Country")
    private String country;

    @SerializedName("CreateDate")
    private String createDate;

    @SerializedName("Currency")
    private Payment.Currency currency;

    @SerializedName("CurrentRecurrencyTry")
    private Integer currentRecurrencyTry;

    @SerializedName("Provider")
    private Payment.Provider provider;

    @SerializedName("RecurrencyDay")
    private Integer recurrencyDay;

    @SerializedName("SuccessfulRecurrences")
    private Integer successfulRecurrences;

    @SerializedName("AuthorizeNow")
    private boolean authorizeNow;

    @SerializedName("ReasonCode")
    private Integer reasonCode;

    @SerializedName("ReasonMessage")
    private String reasonMessage;

    @SerializedName("Status")
    private Integer status;

    @SerializedName("Links")
    private Object links[];

    @SerializedName("RecurrentTransactions")
    private RecurrentTransaction recurrentTransactions[];

    public RecurrentPayment(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
    }

    public boolean isAuthorizeNow() {
        return authorizeNow;
    }

    public RecurrentPayment setAuthorizeNow(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
        return this;
    }

    public String getRecurrentPaymentId() {
        return recurrentPaymentId;
    }

    public RecurrentPayment setRecurrentPaymentId(String recurrentPaymentId) {
        this.recurrentPaymentId = recurrentPaymentId;
        return this;
    }

    public String getNextRecurrency() {
        return nextRecurrency;
    }

    public RecurrentPayment setNextRecurrency(String nextRecurrency) {
        this.nextRecurrency = nextRecurrency;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public RecurrentPayment setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public RecurrentPayment setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Interval getInterval() {
        return interval;
    }

    public RecurrentPayment setInterval(Interval interval) {
        this.interval = interval;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public RecurrentPayment setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public RecurrentPayment setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCreateDate() {
        return createDate;
    }

    public RecurrentPayment setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public Payment.Currency getCurrency() {
        return currency;
    }

    public RecurrentPayment setCurrency(Payment.Currency currency) {
        this.currency = currency;
        return this;
    }

    public Integer getCurrentRecurrencyTry() {
        return currentRecurrencyTry;
    }

    public RecurrentPayment setCurrentRecurrencyTry(Integer currentRecurrencyTry) {
        this.currentRecurrencyTry = currentRecurrencyTry;
        return this;
    }

    public Payment.Provider getProvider() {
        return provider;
    }

    public RecurrentPayment setProvider(Payment.Provider provider) {
        this.provider = provider;
        return this;
    }

    public Integer getRecurrencyDay() {
        return recurrencyDay;
    }

    public RecurrentPayment setRecurrencyDay(Integer recurrencyDay) {
        this.recurrencyDay = recurrencyDay;
        return this;
    }

    public Integer getSuccessfulRecurrences() {
        return successfulRecurrences;
    }

    public RecurrentPayment setSuccessfulRecurrences(Integer successfulRecurrences) {
        this.successfulRecurrences = successfulRecurrences;
        return this;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public RecurrentPayment setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public RecurrentPayment setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public RecurrentPayment setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public RecurrentTransaction[] getRecurrentTransactions() {
        return recurrentTransactions;
    }

    public RecurrentPayment setRecurrentTransactions(RecurrentTransaction[] recurrentTransactions) {
        this.recurrentTransactions = recurrentTransactions;
        return this;
    }

    public Object[] getLinks() {
        return links;
    }

    public enum Interval {
        Monthly, Bimonthly, Quarterly, SemiAnnual, Annual
    }
}