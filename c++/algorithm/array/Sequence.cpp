//Copyright [2018] [Haibo Yan]
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//
// Created by Haibo Yan on 4/10/18.
//

#include "Sequence.h"
#include <set>
#include <iostream>

int Sequence::longestConsecutive(vector<int>& nums) {
    set<int> sn;

    for (auto it = nums.begin(); it != nums.end(); it++) {
        sn.insert(*it);
    }

    auto maxc = 0;

    for (auto it = nums.begin(); it != nums.end(); it++) {
        auto c = *it;
        auto l = c - 1;
        auto r = c + 1;
        auto count = 1;

        set<int>::iterator sni;
        while ((sni = sn.find(l)) != sn.end()) {
            count++;
            sn.erase(sni);
            l--;
        }
        while ((sni = sn.find(r)) != sn.end()) {
            count++;
            sn.erase(sni);
            r++;
        }

        maxc = max(maxc, count);
    }

    return maxc;
}

// Given a string S and a string T, count the number of distinct subsequences of T in S.
// A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of
// the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of
// "ABCDE" while "AEC" is not).
// Here is an example:
// S = "rabbbit", T = "rabbit"
// Return 3.
int Sequence::distinct(string s, string t) {
    if (s.size() < t.size()) {
        return 0;
    }
    int tab[s.size() + 1][t.size() + 1] ;

    for (int i = 0; i <= s.size(); i++) {
        for (int j = 0; j <= t.size(); j++) {
            tab[i][j] = j == 0 && i != s.size() ? 1: 0;
        }
    }

    cout << endl;
    for (int i = 1; i <= s.size(); i++) {
        for (int j = 1; j <= t.size(); j++) {
            if (s[i - 1] == t[j - 1]) {
                tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j];
            } else {
                tab[i][j] = tab[i - 1][j];
            }
        }
    }

    return tab[s.size()][t.size()];
}
