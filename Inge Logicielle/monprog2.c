#include<stdio.h>

/*int abs(int x){
  if (x >= 0 ) return x ;
  else return -x ;
}

int main(void){
  int r = getchar() / 2 ;
  r = abs(r) ;
  return (1/ (r)) ;
}

int main(void){
  int t[10] ;
  int i ;
  for (i=0 ; i<=10 ; i++){
    t[i] = 0 ;
  }
  return 0 ;
}

int main(){
  int x = 5;
  return *(&x + 1) ;
}

int abs(int x){
  if (x >= 0 ) return x ;
  else return -x ;
}

int main(void){
  int r = getchar() ;
  r = abs(r) ;
  if (r<0) return -1;
  else return r ;
}*/
int credit = 0 ;
int tmp    = 1 ;
int tmp2   = 2 ;

void depot(int v){
  printf("Demande de dépôt : %i\n", v) ;
  credit += v ;
  printf ("Depôt effectué, nouveau crédit =%i\n", credit);
}

int retrait(int v){
  printf("Demande de retrait : %i\n", v) ;
  if (credit >= v) {
    credit -= v ;
    printf ("Retrait effectué, nouveau crédit =%i\n", credit);
    return 1 ;
  }
  else {
    printf ("Crédit insuffisant, débit refusé\n");
    return 0 ;
  }
}

int main(void){
  int result ;
  depot(getchar());
  depot (tmp2);
  tmp2+=tmp;
  result = retrait(getchar());
  return result ;
}




