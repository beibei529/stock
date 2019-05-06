package com.hl.stock.core.base.data;

import com.hl.stock.core.base.exception.StockErrorCode;
import com.hl.stock.core.base.model.StockData;
import com.hl.stock.core.base.model.StockMeta;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class StockDaoImpl implements StockDao {
    @Override
    public void saveData(StockData stockData) {
        StockErrorCode.NotImplemented.error();
    }

    @Override
    public void saveMeta(StockMeta stockMeta) {
        StockErrorCode.NotImplemented.error();
    }

    @Override
    public List<StockData> loadData(String code, Date startDate, Date endDate) {
        StockErrorCode.NotImplemented.error();
        return null;
    }

    @Override
    public List<StockMeta> loadMeta() {
        StockErrorCode.NotImplemented.error();
        return null;
    }
}
