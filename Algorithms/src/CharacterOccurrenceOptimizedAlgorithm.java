public class CharacterOccurrenceOptimizedAlgorithm {

    public static void main(String[] args) {
        String inputString = "Test Url";
        int asciiArr[] = new int[123];
        char charArr[] = inputString.toCharArray();
        int caseInsensitiveCount[] = new int[91];

        for (int asciiOfLetter: charArr) {
            if(asciiOfLetter >64 && asciiOfLetter<123 && (asciiOfLetter<91 || asciiOfLetter>96)) {
                if (asciiArr[asciiOfLetter] != 0)
                    asciiArr[asciiOfLetter] += 1;
                else
                    asciiArr[asciiOfLetter] = 1;
                if (asciiOfLetter > 95)
                    if (caseInsensitiveCount[asciiOfLetter - 32] != 0)
                        caseInsensitiveCount[asciiOfLetter - 32] += 1;
                    else
                        caseInsensitiveCount[asciiOfLetter - 32] = 1;
                else if (caseInsensitiveCount[asciiOfLetter] != 0)
                    caseInsensitiveCount[asciiOfLetter] += 1;
                else
                    caseInsensitiveCount[asciiOfLetter] = 1;
            }
        }

        for (int i = 65; i < 123; i++) {
            if(asciiArr[i] != 0){
                System.out.println("Letter "+((char) i)+" occurs " +asciiArr[i]+" times in the String");
            }
        }

        System.out.println("-----------------Case Insesntive Count--------------------");

        for (int i = 65; i < 91; i++) {
            if(caseInsensitiveCount[i] != 0){
                System.out.println("Letter "+((char) i)+" occurs " +caseInsensitiveCount[i]+" times in the String");
            }
        }

    }
}
