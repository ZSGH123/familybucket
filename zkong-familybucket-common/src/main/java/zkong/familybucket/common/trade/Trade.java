package zkong.familybucket.common.trade;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trade implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * tid流水号
     */
    private String tid;

    /**
     * 隐藏id
     */
    private String realTid;

    /**
     * 创建日期
     */
    private Date created;
    /**
     * 收件人
     */
    private String recipient;
    /**
     * 固话
     */
    private String receiverTel;

    /**
     * 手机
     */
    private String receiverPhone;

    /**
     * 省
     */
    private String receiverProvince;
    /**
     * 市
     */
    private String receiverCity;
    /**
     * 区
     */
    private String receiverCounty;
    /**
     * 收件地址
     */
    private String receiverAddress;

    /**
     * 发货信息
     */
    private String shipInfo;

    /**
     * 发件人姓名
     */
    private String senderName;
    /**
     * 发件人电话
     */
    private String senderTel;

    /**
     * 发件人手机
     */
    private String senderPhone;

    /**
     * 发件人省
     */
    private String senderProvince;
    /**
     * 发件人市
     */
    private String senderCity;
    /**
     * 发件人区
     */
    private String senderCounty;

    /**
     * 发件人地址
     */
    private String senderAddress;

    /**
     * 0手打 1套打
     */
    private Integer type;

    /**
     * 备注
     */
    private String remark;
    /**
     * 代收金额
     */
    private BigDecimal collectionMoney;
    /**
     * 代收货款字符串
     */
    private String collectionMoneyStr;
    /**
     * 保价金额
     */
    private BigDecimal declarationValue;
    /**
     * 保价金额字符串
     */
    private String declarationValueStr;

    /**
     * modified
     */
    private Date modified;
    /**
     * status
     */
    private Boolean status;
    /**
     * 优惠
     */
    private String discount;
    /**
     * 实付
     */
    private String payment;

    /**
     * 重量
     */
    private String weight;

    /**
     * 运费
     */
    private String postFee;
    /**
     * 备注旗帜
     */
    private String remarkFlag;

    /**
     * 旺旺
     */
    private String ww;

    /**
     * 拓展字段
     */
    private String propertites;


    private Integer index;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getRealTid() {
        return realTid;
    }

    public void setRealTid(String realTid) {
        this.realTid = realTid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCounty() {
        return receiverCounty;
    }

    public void setReceiverCounty(String receiverCounty) {
        this.receiverCounty = receiverCounty;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(String shipInfo) {
        this.shipInfo = shipInfo;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderProvince() {
        return senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderCounty() {
        return senderCounty;
    }

    public void setSenderCounty(String senderCounty) {
        this.senderCounty = senderCounty;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getCollectionMoney() {
        return collectionMoney;
    }

    public void setCollectionMoney(BigDecimal collectionMoney) {
        this.collectionMoney = collectionMoney;
    }

    public String getCollectionMoneyStr() {
        return collectionMoneyStr;
    }

    public void setCollectionMoneyStr(String collectionMoneyStr) {
        this.collectionMoneyStr = collectionMoneyStr;
    }

    public BigDecimal getDeclarationValue() {
        return declarationValue;
    }

    public void setDeclarationValue(BigDecimal declarationValue) {
        this.declarationValue = declarationValue;
    }

    public String getDeclarationValueStr() {
        return declarationValueStr;
    }

    public void setDeclarationValueStr(String declarationValueStr) {
        this.declarationValueStr = declarationValueStr;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getRemarkFlag() {
        return remarkFlag;
    }

    public void setRemarkFlag(String remarkFlag) {
        this.remarkFlag = remarkFlag;
    }

    public String getWw() {
        return ww;
    }

    public void setWw(String ww) {
        this.ww = ww;
    }

    public String getPropertites() {
        return propertites;
    }

    public void setPropertites(String propertites) {
        this.propertites = propertites;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Trade)) {
            return false;
        }
        Trade trade = (Trade) o;
        return tid != null && tid.equals(trade.getTid());

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        return result;
    }
}