Map<Integer, Integer> digitCount = new HashMap<>();

        countDigits(input1, digitCount);
        countDigits(input2, digitCount);
        countDigits(input3, digitCount);
        countDigits(input4, digitCount);

        int maxCount = 0;
        List<Integer> mostFrequentDigits = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            int digit = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostFrequentDigits.clear();
                mostFrequentDigits.add(digit);
            } else if (count == maxCount) {
                mostFrequentDigits.add(digit);
            }
        }

        // Find the highest (max) digit among the most frequent digits
        int mostFrequentDigit = mostFrequentDigits.get(0);
        for (int i = 1; i < mostFrequentDigits.size(); i++) {
            int digit = mostFrequentDigits.get(i);
            if (digit > mostFrequentDigit) {
                mostFrequentDigit = digit;
            }
        }

        return mostFrequentDigit;
    }

    private static void countDigits(int number, Map<Integer, Integer> digitCount) {
        while (number != 0) {
            int digit = number % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
    }