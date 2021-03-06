/*
 *
 *  * Copyright [2017] [Haibo(Tristan) Yan]
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.haibo.yan.algorithm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestStockBuyAndSell {
    @DataProvider
    public Object[][] stocksI() {
        return new Object[][]{
                {new int[]{7, 1, 5, 3, 6, 4}, 5},
                {new int[]{7, 6, 4, 3, 1}, 0}
        };
    }

    @Test(dataProvider = "stocksI")
    public void testmaxProfitI(int[] stocks, int maxProfit) {
        assertEquals(maxProfit, new StockBuyAndSell().maxProfitI(stocks));
    }

    @DataProvider
    public Object[][] stocksII() {
        return new Object[][]{
                {new int[]{7, 1, 5, 3, 6, 4}, 7},
                {new int[]{7, 6, 4, 3, 1}, 0}
        };
    }

    @Test(dataProvider = "stocksII")
    public void testmaxProfitII(int[] stocks, int maxProfit) {
        assertEquals(maxProfit, new StockBuyAndSell().maxProfitII(stocks));
    }

    @DataProvider
    public Object[][] stocksIII() {
        return new Object[][]{
                {new int[]{7, 1, 5, 3, 6, 4}, 7},
                {new int[]{7, 6, 4, 3, 1}, 0},
                {new int[]{1, 2}, 1}
        };
    }

    @Test(dataProvider = "stocksIII")
    public void testmaxProfitIII(int[] stocks, int maxProfit) {
        assertEquals(maxProfit, new StockBuyAndSell().maxProfitIII(stocks));
    }
}
