# Generated from lc.g4 by ANTLR 4.7.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b")
        buf.write("\33\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write("\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\2\2")
        buf.write("\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\3\3\2c|\2\32\2\3\3\2\2")
        buf.write("\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2")
        buf.write("\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\23\3\2\2\2\t\25")
        buf.write("\3\2\2\2\13\27\3\2\2\2\r\31\3\2\2\2\17\20\7*\2\2\20\4")
        buf.write("\3\2\2\2\21\22\7+\2\2\22\6\3\2\2\2\23\24\7\u03bd\2\2\24")
        buf.write("\b\3\2\2\2\25\26\7^\2\2\26\n\3\2\2\2\27\30\7\60\2\2\30")
        buf.write("\f\3\2\2\2\31\32\t\2\2\2\32\16\3\2\2\2\3\2\2")
        return buf.getvalue()


class lcLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    LLETRA = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "')'", "'\u03BB'", "'\\'", "'.'" ]

    symbolicNames = [ "<INVALID>",
            "LLETRA" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "LLETRA" ]

    grammarFileName = "lc.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


