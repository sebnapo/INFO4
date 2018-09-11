#include<stdio.h>
/*int main (void){
    int x =0;
    int* y = &x;
    x = *y+1;
    y=y+x;
    return *(y-1);
}*/
int main(){
  int t[5] = {1,2,3,4,5};
  int cpt ;
  for (cpt=0 ; cpt<=5 ; cpt++){
    if ( t[cpt] < getchar() )
      return cpt/cpt ;
  }
  return 10 ;
}
/*
int y = 0;
int* x = &y;

int incr(){
  return *x + 1 ;
}

int main(){
  return incr() ;
}*/
/*


int abs(int x){
  if (x >= 0 ) return x ;
  else return -x ;
}

int main(void){
  int r = getchar() / 2 ;
  r = abs(r) ;
  return (1/ (r+1)) ;
}*/
