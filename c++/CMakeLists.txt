cmake_minimum_required (VERSION 3.5)
project (Algorithm)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

# Download and unpack googletest at configure time
configure_file(CMakeLists.txt.in googletest-download/CMakeLists.txt)
execute_process(COMMAND ${CMAKE_COMMAND} -G "${CMAKE_GENERATOR}" .
        RESULT_VARIABLE result
        WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/googletest-download )
if(result)
    message(FATAL_ERROR "CMake step for googletest failed: ${result}")
endif()
execute_process(COMMAND ${CMAKE_COMMAND} --build .
        RESULT_VARIABLE result
        WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/googletest-download )
if(result)
    message(FATAL_ERROR "Build step for googletest failed: ${result}")
endif()

# Prevent overriding the parent_ project's compiler/linker
# settings on Windows
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)

# Prevent overriding the parent_ project's compiler/linker
# settings on Windows
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)

# Add googletest directly to our build. This defines
# the gtest and gtest_main targets.
add_subdirectory(${CMAKE_BINARY_DIR}/googletest-src
        ${CMAKE_BINARY_DIR}/googletest-build
        EXCLUDE_FROM_ALL)
# The gtest/gtest_main targets carry header search path
# dependencies automatically when using CMake 2.8.11 or
# later. Otherwise we have to add them here ourselves.
#if (CMAKE_VERSION VERSION_LESS 2.8.11)
#    include_directories("${gtest_SOURCE_DIR}/include")
#endif()
if (CMAKE_VERSION VERSION_LESS 2.8.11)
    include_directories(BEFORE SYSTEM
            "${gtest_SOURCE_DIR}/include" "${gmock_SOURCE_DIR}/include")
else()
    target_include_directories(gmock_main SYSTEM BEFORE INTERFACE
            "${gtest_SOURCE_DIR}/include" "${gmock_SOURCE_DIR}/include")
endif()

add_executable(algorithm algorithm/datastructure/MedianFinder.h algorithm/datastructure/MedianFinder.cpp algorithm_tests/datastructure/MedianFinderTest.cpp algorithm/datastructure/FenwickTree.cpp algorithm/datastructure/FenwickTree.h algorithm_tests/datastructure/FenwickTreeTest.cpp algorithm/math/ArrangeCoins.cpp algorithm_tests/math/ArrangeCoinsTest.cpp algorithm/math/ArrangeCoins.h algorithm/array/Zigzag.cpp algorithm/array/Zigzag.h algorithm_tests/array/ZigzagTest.cpp algorithm/array/SlidingWindow.cpp algorithm/array/SlidingWindow.h algorithm/array/RemoveDuplicate.cpp algorithm/array/RemoveDuplicate.h algorithm_tests/array/RemoveDuplicateTest.cpp algorithm/stack/MinStack.cpp algorithm/stack/MinStack.h algorithm_tests/stack/MinStackTest.cpp algorithm/misc/BinaryWatch.cpp algorithm/misc/BinaryWatch.h algorithm_tests/misc/BinaryWatchTest.cpp algorithm/misc/RomeDigits.cpp algorithm/misc/RomeDigits.h algorithm_tests/misc/RomeDigitsTest.cpp algorithm/misc/Anagram.cpp algorithm/misc/Anagram.h algorithm/str/RemoveLetters.cpp algorithm/str/RemoveLetters.h algorithm_tests/str/RemoveLettersTest.cpp algorithm/str/ZSort.cpp algorithm/str/ZSort.h algorithm_tests/str/ZSortTest.cpp algorithm/dp/Fibonacci.cpp algorithm/dp/Fibonacci.h algorithm_tests/dp/FibonacciTest.cpp algorithm/math/Utilities.cpp algorithm/math/Utilities.h algorithm_tests/math/UtilitiesTest.cpp algorithm/str/KMP.cpp algorithm/str/KMP.h algorithm_tests/str/KMPTest.cpp algorithm/misc/StockBuySell.cpp algorithm/misc/StockBuySell.h  algorithm/array/BinarySearch.cpp algorithm/array/BinarySearch.h algorithm_tests/array/BinarySearchTest.cpp algorithm/array/RotateArray.cpp algorithm/array/RotateArray.h algorithm/array/PrintPattern.cpp algorithm/array/PrintPattern.h algorithm_tests/array/RotateArrayTest.cpp algorithm_tests/array/PrintPatternTest.cpp algorithm/range/SmallestRange.cpp algorithm/range/SmallestRange.h algorithm_tests/range/SmallestRangeTest.cpp algorithm/matrix/Islands.cpp algorithm/matrix/Islands.h algorithm_tests/matrix/IslandsTest.cpp algorithm/datastructure/MagicDictionary.cpp algorithm/datastructure/MagicDictionary.h algorithm_tests/datastructure/MagicDictionaryTest.cpp algorithm_tests/dp/SplitArrayWIthSameAverageTest.cpp algorithm/dp/SplitArrayWIthSameAverage.cpp algorithm/dp/SplitArrayWIthSameAverage.h algorithm/dp/Coin.cpp algorithm/dp/Coin.h algorithm_tests/dp/CoinTest.cpp algorithm/dp/Knapsack.cpp algorithm/dp/Knapsack.h algorithm_tests/dp/KnapsackTest.cpp algorithm/dp/SubSequence.cpp algorithm/dp/SubSequence.h algorithm_tests/dp/SubSequenceTest.cpp algorithm/bitop/SingleNumber.cpp algorithm/bitop/SingleNumber.h algorithm_tests/bitop/SingleNumberTest.cpp algorithm/bitop/BitUtilities.cpp algorithm/bitop/BitUtilities.h algorithm_tests/bitop/BitUtilitiesTest.cpp algorithm/array/MaxChunks.cpp algorithm/array/MaxChunks.h algorithm_tests/array/MaxChunksTest.cpp algorithm/datastructure/Palindrome.cpp algorithm/datastructure/Palindrome.h algorithm/array/TaskScheduler.cpp algorithm/array/TaskScheduler.h algorithm_tests/array/TaskSchedulerTest.cpp algorithm/str/TopKFrequentWords.cpp algorithm/str/TopKFrequentWords.h algorithm_tests/str/TopKFrequentWordsTest.cpp algorithm/datastructure/RandomizedSet.cpp algorithm/datastructure/RandomizedSet.h algorithm_tests/datastructure/RandomizedSetTest.cpp algorithm/str/Amazon.cpp algorithm/str/Amazon.h algorithm_tests/str/AmazonTest.cpp algorithm/dp/SubsetSum.cpp algorithm/dp/SubsetSum.h algorithm_tests/dp/SubsetSumTest.cpp algorithm/dp/PaintHouse.cpp algorithm/dp/PaintHouse.h algorithm_tests/misc/StockBuySellTest.cpp algorithm/array/ProductLessThanK.cpp algorithm/array/ProductLessThanK.h algorithm_tests/array/SlidingWindowTest.cpp algorithm/datastructure/LinkedList.h algorithm/dp/EditDistance.cpp algorithm/dp/EditDistance.h algorithm_tests/dp/EditDistanceTest.cpp algorithm/dp/Max2D.cpp algorithm/dp/Max2D.h algorithm/dp/Jump.cpp algorithm/dp/Jump.h algorithm/datastructure/BinaryHeap.h algorithm_tests/datastructure/BinaryHeapTest.cpp algorithm/datastructure/RBTree.h algorithm/array/Sequence.cpp algorithm/array/Sequence.h algorithm_tests/array/SequenceTest.cpp algorithm/array/LargestNumber.cpp algorithm/array/LargestNumber.h algorithm_tests/array/LargestNumberTest.cpp algorithm/array/Candies.cpp algorithm/array/Candies.h algorithm_tests/array/CandiesTest.cpp algorithm/array/Water.cpp algorithm/array/Water.h algorithm_tests/array/WaterTest.cpp algorithm_tests/datastructure/PalindromeTest.cpp algorithm/dp/RaceCar.cpp algorithm/dp/RaceCar.h algorithm/datastructure/TreeNode.h algorithm/str/Decode.cpp algorithm/str/Decode.h algorithm_tests/str/DecodeTest.cpp algorithm/datastructure/PathSum.cpp algorithm/datastructure/PathSum.h algorithm/array/GasStation.cpp algorithm/array/GasStation.h algorithm_tests/array/GasStationTest.cpp algorithm/datastructure/TreeTraversal.cpp algorithm/datastructure/TreeTraversal.h algorithm/datastructure/Interval.cpp algorithm/datastructure/Interval.h algorithm/matrix/Matrix.cpp algorithm/matrix/Matrix.h algorithm/stack/Calls.cpp algorithm/stack/Calls.h algorithm_tests/matrix/MatrixTest.cpp algorithm/matrix/Sudoku.cpp algorithm/matrix/Sudoku.h algorithm/stack/NQueens.cpp algorithm/stack/NQueens.h algorithm/str/SubString.cpp algorithm/str/SubString.h algorithm_tests/str/SubStringTest.cpp algorithm/range/Range.cpp algorithm/range/Range.h algorithm/math/Rectangle.cpp algorithm/math/Rectangle.h algorithm_tests/math/RectangleTest.cpp algorithm/datastructure/LRU.h algorithm_tests/datastructure/LRUTest.cpp algorithm/dp/Match.cpp algorithm/dp/Match.h algorithm/stack/Calculator.cpp algorithm/stack/Calculator.h algorithm_tests/stack/CalculatorTest.cpp algorithm/dp/HouseRobber.cpp algorithm/dp/HouseRobber.h algorithm/str/WaterPouring.cpp algorithm/str/WaterPouring.h algorithm_tests/str/WaterPouringTest.cpp)
target_link_libraries(algorithm gmock_main)
add_test(NAME algorithm_test COMMAND algorithm)