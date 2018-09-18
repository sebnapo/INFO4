# Makefile de base pour compilation C/C++
# auteur : G. Raschia
# date : 16.10.2002

APPL = hello-world

SHELL = /bin/sh

# paramètres de compilation et d'édition de liens
CC = gcc
LD = $(CC)
CFLAGS =
LDFLAGS =
CPPFLAGS =
LOADLIBS =
LDLIBS =
TAROPT=zcvf

# objets de l'application
SRCS = hello-world.c 
OBJS = $(subst .c,.o,$(SRCS))
EXEC = $(APPL)

# directive d'inhibition des suppressions
.PRECIOUS: $(EXEC)

# directive d'action par défaut, en cas d'erreur
.DEFAULT: ; @echo "$< n'est pas une cible valide"
	
# directive d'application des règles implicites
.SUFFIXES:             # supprime les suffixes par défaut
#.SUFFIXES: .c .o      # définit une liste de suffixes

%.o : %.c
	$(CC) -c $(CFLAGS) $(CPPFLAGS) $< -o $@


		  
# règle de construction de l'application
$(EXEC): $(OBJS)
	$(LD) $(LDFLAGS) $^ -o $@ $(LOADLIBS) $(LDLIBS)

$(APPL).tar.gz: $(OBJS)
	tar $(TAROPT) $@ $(APPL)

clean:
	-@rm -f $(OBJS) $(EXEC) core a.out 2>/dev/null
