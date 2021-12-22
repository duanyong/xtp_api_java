package com.zts.xtp.trade;

import com.zts.xtp.common.model.ErrorMessage;
import com.zts.xtp.trade.model.response.*;
import com.zts.xtp.trade.spi.TradeSpi;

public class TradeSpiImpl implements TradeSpi {

    @Override
    public void onOrderEvent(String orderXtpId, int orderClientId, int orderCancelClientId, String orderCancelXtpId,
                             String ticker, int marketType, double price, long quantity, int priceType, int sideType,
                             int positionEffectType, int businessType, long qtyTraded, long qtyLeft, long insertTime,
                             long updateTime, long cancelTime, double tradeAmount, String orderLocalId,
                             int orderStatusType, int orderSubmitStatusType, char txtPOrderTypeType, int requestId,
                             boolean lastResp,  ErrorMessage errorMessage, String sessionId) {
        System.out.println("onOrderEvent orderInfo: " + orderXtpId);
    }

    @Override
    public void onDisconnect(String sessionId, int reason) {
        System.out.println("onDisconnect");
    }

    @Override
    public void onError(ErrorMessage errorMessage) {
        System.out.println("onError: " + errorMessage.toString());
    }

    @Override
    public void onFundTransfer(FundTransferResponse fundTransferInfo, ErrorMessage errorMessage, String sessionId) {
        if (fundTransferInfo != null) {
            System.out.println("onFundTransfer: " + fundTransferInfo.toString());
        } else {
            System.out.println("onFundTransfer error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryAsset(AssetResponse assetInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onQueryAsset: " + assetInfo.toString());
    }

    @Override
    public void onQueryETF(ETFBaseResponse etfBaseInfo, ErrorMessage errorMessage, String sessionId) {
        if (etfBaseInfo != null) {
            System.out.println("onQueryETF: " + etfBaseInfo.toString());
        } else {
            System.out.println("onQueryETF error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryETFBasket(ETFComponentResponse etfComponentInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onQueryETFBasket: " + etfComponentInfo.toString());
    }

    @Override
    public void onQueryFundTransfer(FundTransferResponse fundTransferInfo, ErrorMessage errorMessage, String sessionId) {
        if (fundTransferInfo != null) {
            System.out.println("onQueryFundTransfer: " + fundTransferInfo.toString());
        } else {
            System.out.println("onQueryFundTransfer error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryOtherServerFund(XTPFundQueryRsp rsp, ErrorMessage errorMessage, String sessionId) {
        if (rsp != null) {
            System.out.println("onQueryOtherServerFund: " + rsp.toString());
        } else {
            System.out.println("onQueryOtherServerFund error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryIPOInfoList(IPOTickerResponse ipoTickerInfo, ErrorMessage errorMessage, String sessionId) {
        if (ipoTickerInfo != null) {
            System.out.println("onQueryIPOInfoList: " + ipoTickerInfo.toString());
        } else {
            System.out.println("onQueryIPOInfoList error: " + errorMessage.toString());
        }

    }

    @Override
    public void onQueryIPOQuotaInfo(IPOQuotaResponse ipoQuotaInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onQueryIPOQuotaInfo: " + ipoQuotaInfo.toString());
    }

    @Override
    public void onQueryOrder(OrderResponse orderInfo, ErrorMessage errorMessage, String sessionId) {
        if (orderInfo != null) {
            System.out.println("onQueryOrder: " + orderInfo.toString());
        } else {
            System.out.println("onQueryOrder error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryOrderByPage(OrderResponse orderInfo, long reqCount, long orderSequence, long queryReference, String sessionId) {
        if (orderInfo != null) {
            System.out.println("onQueryOrderByPage: " + orderInfo.toString() + "  reqCount="+reqCount+"  orderSequence="+orderSequence+"  queryReference="+queryReference+"  sessionId="+sessionId);
        } else {
            System.err.println("onQueryOrderByPage error");
        }
    }

    @Override
    public void onQueryTradeByPage(TradeResponse tradeInfo, long reqCount, long tradeSequence, long queryReference, String sessionId) {
        if (tradeInfo != null) {
            System.out.println("onQueryTradeByPage: " + tradeInfo.toString() + "  reqCount="+reqCount+"  tradeSequence="+tradeSequence+"  queryReference="+queryReference+"  sessionId="+sessionId);
        } else {
            System.err.println("onQueryTradeByPage error");
        }
    }

    @Override
    public void onQueryPosition(StockPositionResponse stockPositionInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onQueryPosition: " + stockPositionInfo.toString());
    }


    @Override
    public void onQueryStructuredFund(StructuredFundResponse structuredFundInfo, ErrorMessage errorMessage, String sessionId) {
        if (structuredFundInfo != null ) {
            System.out.println("onQueryStructuredFund: " + structuredFundInfo.toString());
        } else {
            System.out.println("onQueryStructuredFund error: " + errorMessage.toString());
        }
    }

    @Override
    public void onQueryTrade(TradeResponse tradeInfo, ErrorMessage errorMessage, String sessionId) {
        if (tradeInfo != null) {
            System.out.println("onQueryTrade: " + tradeInfo.toString());
        } else {
            System.out.println("onQueryTrade error: " + errorMessage.toString());
        }
    }


    @Override
    public void onTradeEvent(String orderXtpId, int orderClientId, String ticker, int marketType, String localOrderId, String execId,
                             double price, long quantity, long tradeTime, double tradeAmount, String reportIndex, String orderExchId,
                             char tradeType, int sideType, int positionEffectType, int businessType, String branchPbu, int requestId,
                             boolean lastResp, String sessionId) {
        System.out.println("onTradeEvent: " + orderXtpId);
    }

    @Override
    public void onCancelOrderError(OrderCancelResponse orderCancelInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onCancelOrderError: " + orderCancelInfo.toString());
    }

    @Override
    public void OnQueryOptionAuctionInfo(OptionAuctionInfoResponse optionAuctionInfoResponse, ErrorMessage errorMessage, String sessionId){
        System.out.println("OnQueryOptionAuctionInfo: " + optionAuctionInfoResponse.toString());
    }

    @Override
    public void onInsertAlgoOrder(XTPStrategyInfoStruct strategyInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onInsertAlgoOrder XTPStrategyInfoStruct: " + strategyInfo.toString());
        System.out.println("errorMessage: " + errorMessage.toString());
    }

    @Override
    public void onCancelAlgoOrder(XTPStrategyInfoStruct strategyInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onCancelAlgoOrder XTPStrategyInfoStruct: " + strategyInfo.toString());
        System.out.println("errorMessage: " + errorMessage.toString());
    }

    @Override
    public void onQueryStrategy(XTPStrategyInfoStruct strategyInfo, String strategyParam, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onQueryStrategy XTPStrategyInfoStruct: " + strategyInfo.toString());
        System.out.println("onQueryStrategy strategyParam: " + strategyParam);
        System.out.println("onQueryStrategy errorMessage: " + errorMessage.toString());
    }

    @Override
    public void onAlgoUserEstablishChannel(String user, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onAIGOUserVerification user: " + user);
        System.out.println("onAIGOUserVerification: " + errorMessage.toString());
        System.out.println("onAIGOUserVerification sessionId: " + sessionId);
    }

    @Override
    public void onStrategyStateReport(XTPStrategyStateReportStruct strategyInfo, ErrorMessage errorMessage, String sessionId) {
        System.out.println("onStrategyStateReport strategyInfo: " + strategyInfo);
        System.out.println("onStrategyStateReport errorMessage: " + errorMessage.toString());
        System.out.println("onStrategyStateReport sessionId: " + sessionId);
    }

    @Override
    public void onAlgoDisconnected(int reason) {
        System.out.println("algo disconnected reason: " + reason);
    }

    @Override
    public void onAlgoConnected() {
        System.out.println("algo connected ");
    }

    /**
     * ������ȯҵ�����ֽ�ֱ�ӻ������Ӧ
     * @param cashRepayRsp �ֽ�ֱ�ӻ���֪ͨ�ľ�����Ϣ���û�����ͨ��cashRepayRsp.orderXtpId����������ͨ��GetClientIDByXTPID() == clientId�������Լ��Ķ�����
     * @param errorMessage �ֽ𻹿������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onCreditCashRepay(XTPCrdCashRepayRsp cashRepayRsp, ErrorMessage errorMessage, String sessionId){
        System.out.println("onCreditCashRepay cashRepayRsp: " + cashRepayRsp);
        System.out.println("onCreditCashRepay errorMessage: " + errorMessage.toString());
        System.out.println("onCreditCashRepay sessionId: " + sessionId);
    }

    /**
     * ������ȯҵ�����ֽ�Ϣ����Ӧ
     * @param cashRepayDebtInterestFeeRsp �ֽ�Ϣ֪ͨ�ľ�����Ϣ���û�����ͨ��cashRepayDebtInterestFeeRsp.orderXtpId����������ͨ��GetClientIDByXTPID() == clientId�������Լ��Ķ�����
     * @param errorMessage �ֽ�Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onCreditCashRepayDebtInterestFee(XTPCrdCashRepayDebtInterestFeeRsp cashRepayDebtInterestFeeRsp, ErrorMessage errorMessage, String sessionId){
        System.out.println("onCreditCashRepayDebtInterestFee cashRepayDebtInterestFeeRsp: " + cashRepayDebtInterestFeeRsp);
        System.out.println("onCreditCashRepayDebtInterestFee errorMessage: " + errorMessage.toString());
        System.out.println("onCreditCashRepayDebtInterestFee sessionId: " + sessionId);
    }

    /**
     * �����ѯ������ȯҵ���е��ֽ�ֱ�ӻ��������Ӧ
     * @param cashRepayInfo ��ѯ����ĳһ���ֽ�ֱ�ӻ���֪ͨ�ľ�����Ϣ
     * @param errorMessage ��ѯ�ֽ�ֱ�ӱ�����������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditCashRepayInfo(XTPCrdCashRepayInfo cashRepayInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditCashRepayInfo cashRepayInfo: " + cashRepayInfo);
        System.out.println("onQueryCreditCashRepayInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditCashRepayInfo sessionId: " + sessionId);
    }

    /**
     * �����ѯ�����˻�������Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param fundInfo ��ѯ���������˻�������Ϣ���
     * @param errorMessage ��ѯ�����˻�������Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditFundInfo(XTPCrdFundInfo fundInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditFundInfo fundInfo: " + fundInfo);
        System.out.println("onQueryCreditFundInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditFundInfo sessionId: " + sessionId);
    }

    /**
     * �����ѯ�����˻���ծ��Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param debtInfo ��ѯ���������˻���Լ��ծ���
     * @param errorMessage ��ѯ�����˻���ծ��Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditDebtInfo(XTPCrdDebtInfo debtInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditDebtInfo debtInfo: " + debtInfo);
        System.out.println("onQueryCreditDebtInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditDebtInfo sessionId: " + sessionId);
    }

    /**
     * �����ѯ�����˻�ָ��֤ȯ��ծδ����Ϣ��Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param debtStockInfo ��ѯ���������˻�ָ��֤ȯ��ծδ����Ϣ���
     * @param errorMessage ��ѯ�����˻�ָ��֤ȯ��ծδ����Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditTickerDebtInfo(XTPCrdDebtStockInfo debtStockInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditTickerDebtInfo debtStockInfo: " + debtStockInfo);
        System.out.println("onQueryCreditTickerDebtInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditTickerDebtInfo sessionId: " + sessionId);
    }

    /**
     * �����ѯ�����˻������ʽ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param remainAmount ��ѯ���������˻������ʽ�
     * @param errorMessage ��ѯ�����˻������ʽ�������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditAssetDebtInfo(double remainAmount, ErrorMessage errorMessage,int requestId, String sessionId){
        System.out.println("onQueryCreditAssetDebtInfo remainAmount: " + remainAmount);
        System.out.println("onQueryCreditAssetDebtInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditAssetDebtInfo sessionId: " + sessionId);
    }

    /**
     * �����ѯ�����˻�����ȯͷ����Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param assignInfo ��ѯ���������˻�����ȯͷ����Ϣ
     * @param errorMessage ��ѯ�����˻�����ȯͷ����Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditTickerAssignInfo(XTPClientQueryCrdPositionStkInfo assignInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditTickerAssignInfo assignInfo: " + assignInfo);
        System.out.println("onQueryCreditTickerAssignInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditTickerAssignInfo sessionId: " + sessionId);
    }

    /**
     * ������ȯҵ���������ѯָ����ȯ��Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param stockInfo ��ѯ������ȯ��Ϣ
     * @param errorMessage ��ѯ�����˻���ȯ��Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditExcessStock(XTPClientQueryCrdSurplusStkRspInfo stockInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditExcessStock stockInfo: " + stockInfo);
        System.out.println("onQueryCreditExcessStock errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditExcessStock sessionId: " + sessionId);
    }

    /**
     * ������ȯҵ���������ѯ��ȯ��Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param stockInfo ��ѯ������ȯ��Ϣ
     * @param errorMessage ��ѯ�����˻���ȯ��Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryMulCreditExcessStock(XTPClientQueryCrdSurplusStkRspInfo stockInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryMulCreditExcessStock stockInfo: " + stockInfo);
        System.out.println("onQueryMulCreditExcessStock errorMessage: " + errorMessage.toString());
        System.out.println("onQueryMulCreditExcessStock sessionId: " + sessionId);
    }

    /**
     * ������ȯҵ���и�ծ��Լչ�ڵ�֪ͨ
     * @param debtExtendInfo ��ծ��Լչ��֪ͨ�ľ�����Ϣ���û�����ͨ��debt_extend_info.xtpid����������ͨ��GetClientIDByXTPID() == clientId�������Լ��Ķ�����
     * @param errorMessage ��ծ��Լչ�ڶ������ܾ����߷�������ʱ�������ʹ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ����ծ��Լչ�ڶ�����״̬�仯��ʱ�򣬻ᱻ���ã���Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ�����ߡ����е�¼�˴��û��Ŀͻ��˶����յ����û��ĸ�ծ��Լչ��֪ͨ��
     */
    @Override
    public void onCreditExtendDebtDate(XTPCreditDebtExtendNotice debtExtendInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onCreditExtendDebtDate debtExtendInfo: " + debtExtendInfo);
        System.out.println("onCreditExtendDebtDate errorMessage: " + errorMessage.toString());
        System.out.println("onCreditExtendDebtDate sessionId: " + sessionId);
    }

    /**
     * ��ѯ������ȯҵ���и�ծ��Լչ�ڶ�����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param debtExtendInfo ��ѯ���ĸ�ծ��Լչ�����
     * @param errorMessage ��ѯ��ծ��Լչ�ڷ�������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д��󡣵�errorMessage.errorId=11000350ʱ������û�м�¼����Ϊ������0ֵʱ��������Լ�����ܵ�ʱ�Ĵ���ԭ��
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditExtendDebtDateOrders(XTPCreditDebtExtendNotice debtExtendInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditExtendDebtDateOrders debtExtendInfo: " + debtExtendInfo);
        System.out.println("onQueryCreditExtendDebtDateOrders errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditExtendDebtDateOrders sessionId: " + sessionId);
    }

    /**
     * ��ѯ������ȯҵ���������˻�������Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param fundExtraInfo �����˻�������Ϣ
     * @param errorMessage ��ѯ�����˻�������Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditFundExtraInfo(XTPCrdFundExtraInfo fundExtraInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditFundExtraInfo fundExtraInfo: " + fundExtraInfo);
        System.out.println("onQueryCreditFundExtraInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditFundExtraInfo sessionId: " + sessionId);
    }

    /**
     * ��ѯ������ȯҵ���������˻�ָ��֤ȯ�ĸ�����Ϣ����Ӧ����Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     * @param positionExtraInfo �����˻�ָ��֤ȯ�ĸ�����Ϣ
     * @param errorMessage ��ѯ�����˻�������Ϣ��������ʱ���صĴ�����Ϣ����errorMessageΪ�գ�����errorMessage.errorIdΪ0ʱ������û�д���
     * @param sessionId �ʽ��˻���Ӧ��sessionId����¼ʱ�õ�
     * @remark ��Ҫ���ٷ��أ���������������Ϣ������������ʱ���ᴥ������
     */
    @Override
    public void onQueryCreditPositionExtraInfo(XTPCrdPositionExtraInfo positionExtraInfo, ErrorMessage errorMessage, String sessionId){
        System.out.println("onQueryCreditPositionExtraInfo positionExtraInfo: " + positionExtraInfo);
        System.out.println("onQueryCreditPositionExtraInfo errorMessage: " + errorMessage.toString());
        System.out.println("onQueryCreditPositionExtraInfo sessionId: " + sessionId);
    }

}
