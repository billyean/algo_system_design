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
// Created by Haibo Yan on 3/19/18.
//

#ifndef ALGORITHM_BINARYSEARCH_H
#define ALGORITHM_BINARYSEARCH_H

#include <vector>

using namespace std;

class BinarySearch {
public:
    static int search(int *, int, int);

    static double median(vector<int>&, vector<int>&);
private:
    static int search(int *, int, int, int);

    static int kth(vector<int>&, vector<int>&, int, int, int);
};


#endif //ALGORITHM_BINARYSEARCH_H
