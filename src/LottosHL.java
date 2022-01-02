class LottosHL {


        public int[] solution(int[] lottos, int[] win_nums) {



            int[] answer = {};

            return answer;
        }

    public static void main(String[] args) {
        int[] lottos = {1,2,3,4,5,6};//구매한 로또번호
        int[] win_nums = {1,2,3,4,5,6};//당첨번호
        for(int i = 0;i< lottos.length; i++){
            //일치하는지 확인
            if(lottos[i] == win_nums[i]){
                System.out.println("lottos["+i+"] == win_nums["+i+"]");

            }
        }
    }

    }

