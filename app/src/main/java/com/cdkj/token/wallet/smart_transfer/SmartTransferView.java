package com.cdkj.token.wallet.smart_transfer;

import com.cdkj.baselibrary.base.mvp.MVPView;
import com.cdkj.token.model.CoinModel;

import java.math.BigDecimal;

/**
 * Created by cdkj on 2018/9/10.
 */

public interface SmartTransferView extends MVPView {

    void showGoogleEdit(boolean isVisible);//google身份验证输入框

    void setCenterPage(); //显示中心化界面

    void setPrivatePage();//显示私有界面

    void resetFeeBarProgress();//切换币种时重新设置进度条

    void setCoins(CoinModel coinModel);//币种数据

    void setSelectCoin(CoinModel.AccountListBean accountListBean);//币种选择

    void setBalance(BigDecimal balance);//币种余额

    void setFee(BigDecimal fee);//手续费

    void seekBarChange();//手续费滑动

    void showPayPwdDialog(boolean isPrivate);//密码弹框

    void transferSuccess(boolean isPrivate);

    void transferFail(boolean isPrivate);

    void showMessageDialog(String msg);

    void showLoadDialog();

    void disMissLoadDialog();


}
