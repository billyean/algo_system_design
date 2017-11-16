/*
 * Copyright (c) [2017] [Haibo(Tristan) Yan]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haibo.yan.algorithm.bfs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestWordLadder {
    @DataProvider
    public Object[][] wordLadders() {
        return new Object[][]{
                {"hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"), 5}
        };
    }

    @Test(dataProvider = "wordLadders")
    public void testLadderLen(String beginWord, String endWord, List<String> dict, int expectedLen) {
//        assertEquals(new WordLadder().ladderLength(beginWord, endWord, dict), expectedLen);
    }
}
