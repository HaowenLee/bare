package com.haowen.bare.parse;

import com.haowen.bare.result.BareResResult;

import java.io.IOException;

/**
 * ================================================
 * 作    者：Herve、Li
 * 创建日期：2021/3/15
 * 描    述：
 * 修订历史：
 * ================================================
 */
public interface BareParser {

    /**
     * 获取无水印资源信息
     *
     * @param link 复制的链接
     * @return 无水印资源信息
     */
    BareResResult parse(String link) throws IOException;
}
