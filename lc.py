from __future__ import annotations
from antlr4 import *
from lcLexer import lcLexer
from lcParser import lcParser
from lcVisitor import lcVisitor
from dataclasses import dataclass
from functools import reduce

class Buit:
    pass

@dataclass
class Node:
    val: str
    child: [Arbre]

Arbre = Node | Buit

def mida(a: Arbre) -> int:
    match a:
        case Buit():
            return 0
        case Node(x,L):
            return 1 + reduce(lambda acc,y: acc+y, L)

@dataclass
class App:
    t1: Terme
    t2: Terme

@dataclass
class Abs:
    lambda: string
    body: Terme


class TreeVisitor(lcVisitor):

    def __init__(self):
        self.tree = Node('root', [])
        self.level = 0

    def visitParentesis(self,ctx):
        [op1,terme,op2] = list(ctx.getChildren())

    def visitLetra(self,ctx):
        [v] = list(ctx.getChildren())
        return Var(getText())

input_stream = InputStream(input('? '))
lexer = lcLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = lcParser(token_stream)
tree = parser.root()

visitor = TreeVisitor()
visitor.visit(tree)

print(tree.toStringTree(recog=parser))