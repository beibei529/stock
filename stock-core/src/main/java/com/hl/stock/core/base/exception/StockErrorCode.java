package com.hl.stock.core.base.exception;

import com.hl.stock.core.common.exception.AppException;
import com.hl.stock.core.common.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通用错误码
 */
public enum StockErrorCode {
    // common 10001-19999
    Unkown(10001, "Unkown"),
    NotImplemented(10002, "NotImplemented"),

    // model 20001-29999

    // downloadHistory 30001-39999
    ExtractStockMetaFail(30001, "ExtractStockMetaFail"),        // 解析股票元数据失败

    DownloadStockDataFail(30002, "DownloadStockDataFail"),      // 下载股票数据失败

    ConvertStockDataFail(30003, "ConvertStockDataFail");        // 转换股票数据失败

    // data 40001-49999

    // query 50001-59999

    // emulation 60001-69999

    // analysis 70001-79999

    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(StockErrorCode.class);

    /**
     * 错误码
     */
    protected final int code;

    /**
     * 错误信息
     */
    protected final String desc;

    StockErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    protected ErrorCode toErrorCode() {
        return new ErrorCode(code, desc);
    }

    public void error() throws AppException {
        toErrorCode().error();
    }

    public void error(Throwable cause) throws AppException {
        toErrorCode().error(cause);
    }
}
