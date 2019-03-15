public class User {
    public int rank = -8;
    public int progress = 0;

    public void incProgress(int grade){
        if(grade > 8 || grade < -8 || grade == 0) throw new IllegalArgumentException();
        if(rank == 8) return;
        int gap = grade - rank;
        if(this.rank < 0 && grade > 0) gap = gap-1;
        if(this.rank > 0 && grade < 0) gap = gap+1;
        if(gap > 0) {
            int score = 10 * gap * gap;
            this.progress = this.progress + score;
        }else{
            if(gap < -1) return;
            if(gap == 0) this.progress = this.progress + 3;
            if(gap == -1) this.progress = this.progress + 1;
        }
        System.out.println("progress=" + progress);
        if(this.progress > 99){
            int level = this.progress / 100;
            System.out.println("level="+level);
            rank = rank + level;
            if(rank == 0 ) rank++;
            this.progress = this.progress - (100 * level);
            if(rank == 8) this.progress = 0;
        }
        return;
    }
}
