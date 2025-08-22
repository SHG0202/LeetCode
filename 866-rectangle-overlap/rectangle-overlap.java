class Solution {
    public boolean isRectangleOverlap(int[] L1, int[] L2) {
        if(L1[0] == L2[0] && L1[1] == L2[1] && L1[2] == L2[2] && L1[3] == L2[3]){
            return true;
        }
        
        // If one of the corners of A is inside B rectangle
        if((L1[0] > L2[0] && L1[1] > L2[1]) && (L1[0] < L2[2] && L1[1] < L2[3])){
            return true;
        }
        if((L1[2] > L2[0] && L1[3] > L2[1]) && (L1[2] < L2[2] && L1[3] < L2[3])){
            return true;
        }
        if((L1[0] > L2[0] && L1[3] > L2[1]) && (L1[0] < L2[2] && L1[3] < L2[3])){
            return true;
        }
        if((L1[2] > L2[0] && L1[1] > L2[1]) && (L1[2] < L2[2] && L1[1] < L2[3])){
            return true;
        }

        // If one of the corners of B is inside A rectangle
        if((L2[0] > L1[0] && L2[1] > L1[1]) && (L2[0] < L1[2] && L2[1] < L1[3])){
            return true;
        }
        if((L2[2] > L1[0] && L2[3] > L1[1]) && (L2[2] < L1[2] && L2[3] < L1[3])){
            return true;
        }
        if((L2[0] > L1[0] && L2[3] > L1[1]) && (L2[0] < L1[2] && L2[3] < L1[3])){
            return true;
        }
        if((L2[2] > L1[0] && L2[1] > L1[1]) && (L2[2] < L1[2] && L2[1] < L1[3])){
            return true;
        }

        //if they only share a common space without having any corners inside each other
        if(((L1[0] > L2[0] && L1[0] < L2[2]) || (L1[2] > L2[0] && L1[2] < L2[2])) && (L1[1] <= L2[1] && L1[1] < L2[3]) && (L1[3] > L2[1] || L1[3] > L2[3])){
            return true;
        }
        if(((L2[0] > L1[0] && L2[0] < L1[2]) || (L2[2] > L1[0] && L2[2] < L1[2])) && (L2[1] <= L1[1] && L2[1] < L1[3]) && (L2[3] > L1[1] && L2[3] >= L1[3])){
            return true;
        }

        return false;
    }
}