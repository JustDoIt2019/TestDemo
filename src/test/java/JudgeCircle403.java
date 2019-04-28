package studying;

import org.testng.annotations.Test;

public class JudgeCircle403 {
    @Test
    public void runJudgeCircle(){
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("asdf"));
    }
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char s : moves.toCharArray()) {
            switch (s) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'U':
                    y--;
                    break;
                default:
                    break;
            }
        }
        return (x == 0 && y == 0);
    }
}
