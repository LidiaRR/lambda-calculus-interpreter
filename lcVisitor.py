# Generated from lc.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .lcParser import lcParser
else:
    from lcParser import lcParser

# This class defines a complete generic visitor for a parse tree produced by lcParser.

class lcVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by lcParser#root.
    def visitRoot(self, ctx:lcParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lcParser#parentesis.
    def visitParentesis(self, ctx:lcParser.ParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lcParser#lletra.
    def visitLletra(self, ctx:lcParser.LletraContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lcParser#abs.
    def visitAbs(self, ctx:lcParser.AbsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lcParser#aplicacio.
    def visitAplicacio(self, ctx:lcParser.AplicacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lcParser#abstraccio.
    def visitAbstraccio(self, ctx:lcParser.AbstraccioContext):
        return self.visitChildren(ctx)



del lcParser