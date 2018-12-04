package com.imooc.oa.dto;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;

import java.util.List;

/***
 *  ClassName : ClaimVoucherInfo
 *  Author    : lin
 *  Date      : 2018/12/4 11:50    
 *  Remark    : 
 */

public class ClaimVoucherInfo {
    private ClaimVoucher claimVoucher;

    private List<ClaimVoucherItem> items;

    public void setClaimVoucher(ClaimVoucher claimVoucher) {
        this.claimVoucher = claimVoucher;
    }

    public void setItems(List<ClaimVoucherItem> items) {
        this.items = items;
    }

    public ClaimVoucher getClaimVoucher() {
        return claimVoucher;
    }

    public List<ClaimVoucherItem> getItems() {
        return items;
    }
}
