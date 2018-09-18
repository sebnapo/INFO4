#MACROS
LATEX=latex
BASENAME=foo
DVItoPDF=dvipdf
DPFLAGS=
VIEWER=xdvi
PDFVIEWER=evince

#REGLES
all : pdf clean

pdf : dvi
	$(DVItoPDF) $(BASENAME).$<
dvi : $(BASENAME).tex figure.eps dependance.eps
	$(LATEX) $<
	$(VIEWER) $(BASENAME).$@
clean : 
	rm -rf $(BASENAME).aux $(BASENAME).log