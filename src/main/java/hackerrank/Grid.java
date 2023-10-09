package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
    public static String gridChallenge(List<String> grid) {
        // make a char array out of the strings
        int len = grid.get(0).length();
        char [][] charGrid = new char[grid.size()][len];

        // for each string in grid, create a sorted array of its chars
        int count = 0;
        for (String s : grid) {
            char [] c = s.toCharArray();
            Arrays.sort(c);
            for (int i = 0; i < len; i++) {
                charGrid[count][i] = c[i];
            }
            count++;
        }

//        for (int i = 0; i < len; i++) {
//            System.out.println(Arrays.toString(charGrid[i]));
//        }

        // now scan the charGrid col by col
        // and if you find charGrid[j[i] > charGrid[j+1][i] return "NO"
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (grid.size() - 1); j++) {
                if(charGrid[j][i] > charGrid[j+1][i]) {
                    return "NO";
                }
            }

        }


        return "YES";
    }

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("mpxz");
        grid.add("abcd");
        grid.add("wlmf");
//        grid.add("ebacd");
//        grid.add("fghij");
//        grid.add("olmkn");
//        grid.add("trpqs");
//        grid.add("xywuv");
        System.out.println(gridChallenge(grid));
    }
}
