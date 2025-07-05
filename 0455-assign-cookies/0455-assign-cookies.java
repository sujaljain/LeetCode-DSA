class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        int g=greed.length;
        int s=size.length;

        Arrays.sort(greed);
        Arrays.sort(size);

        int l=0, r=0;

        while(l<s && r<g){
            if (greed[r] <= size[l]){
                r++;
            }
            l++;
        }

        return r;
    }
}