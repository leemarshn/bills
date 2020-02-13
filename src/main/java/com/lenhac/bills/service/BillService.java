package com.lenhac.bills.service;

import com.lenhac.bills.model.Bill;
import com.lenhac.bills.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public Bill CreateBill(Bill bill){
        return billRepository.save(bill);
    }


}
