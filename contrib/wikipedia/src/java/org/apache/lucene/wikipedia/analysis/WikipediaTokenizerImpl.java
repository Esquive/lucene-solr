/* The following code was generated by JFlex 1.4.1 on 1/3/08 10:05 PM */

package org.apache.lucene.wikipedia.analysis;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.lucene.analysis.Token;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 1/3/08 10:05 PM from the specification file
 * <tt>/Volumes/User/grantingersoll/projects/lucene/Lucene-Trunk/contrib/wikipedia/src/java/org/apache/lucene/wikipedia/analysis/WikipediaTokenizerImpl.jflex</tt>
 */
class WikipediaTokenizerImpl {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int DOUBLE_BRACE_STATE = 7;
  public static final int INTERNAL_LINK_STATE = 2;
  public static final int TWO_SINGLE_QUOTES_STATE = 4;
  public static final int CATEGORY_STATE = 1;
  public static final int FIVE_SINGLE_QUOTES_STATE = 5;
  public static final int STRING = 8;
  public static final int YYINITIAL = 0;
  public static final int DOUBLE_EQUALS_STATE = 6;
  public static final int THREE_SINGLE_QUOTES_STATE = 5;
  public static final int EXTERNAL_LINK_STATE = 3;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\24\1\23\1\0\1\24\1\22\22\0\1\24\1\0\1\12"+
    "\1\52\2\0\1\3\1\1\4\0\1\14\1\5\1\2\1\10\12\16"+
    "\1\27\1\0\1\7\1\11\1\13\1\52\1\4\2\15\1\30\5\15"+
    "\1\41\21\15\1\25\1\0\1\26\1\0\1\6\1\0\1\31\1\43"+
    "\2\15\1\33\1\40\1\34\1\50\1\41\4\15\1\42\1\35\1\51"+
    "\1\15\1\36\1\15\1\32\3\15\1\44\1\37\1\15\1\45\1\47"+
    "\1\46\102\0\27\15\1\0\37\15\1\0\u0568\15\12\17\206\15\12\17"+
    "\u026c\15\12\17\166\15\12\17\166\15\12\17\166\15\12\17\166\15\12\17"+
    "\167\15\11\17\166\15\12\17\166\15\12\17\166\15\12\17\340\15\12\17"+
    "\166\15\12\17\u0166\15\12\17\266\15\u0100\15\u0e00\15\u1040\0\u0150\21\140\0"+
    "\20\21\u0100\0\200\21\200\0\u19c0\21\100\0\u5200\21\u0c00\0\u2bb0\20\u2150\0"+
    "\u0200\21\u0465\0\73\21\75\15\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\4\1\4\2\1\3\1\1\1\4\2\1\1\5"+
    "\1\1\1\6\2\7\1\10\1\11\1\10\1\12\1\13"+
    "\1\7\1\14\1\15\1\16\1\17\1\7\1\20\1\7"+
    "\4\21\1\22\1\21\1\23\1\24\1\25\3\0\1\26"+
    "\14\0\1\27\1\30\1\10\1\0\1\31\1\0\1\32"+
    "\1\0\1\33\3\0\1\34\1\35\2\36\1\35\2\37"+
    "\2\0\1\36\1\0\14\36\1\35\3\0\1\10\1\40"+
    "\3\0\1\41\1\42\5\0\1\43\4\0\1\43\2\0"+
    "\2\43\2\0\1\10\5\0\1\30\1\35\1\36\1\44"+
    "\5\0\1\45\30\0\1\46\2\0\1\47\1\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u0183\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2"+
    "\0\u03dd\0\u0183\0\u035c\0\u0408\0\u0183\0\u0433\0\u045e\0\u0489"+
    "\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1"+
    "\0\u0183\0\u060c\0\u035c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u0183"+
    "\0\u0183\0\u06e3\0\u070e\0\u0739\0\u0183\0\u0764\0\u078f\0\u07ba"+
    "\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912"+
    "\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a"+
    "\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2"+
    "\0\u0bed\0\u0c18\0\u07ba\0\u0c43\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef"+
    "\0\u0d1a\0\u0d45\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c\0\u0e47"+
    "\0\u0e72\0\u0e9d\0\u0ec8\0\u0ef3\0\u0f1e\0\u0f49\0\u0f74\0\u0f9f"+
    "\0\u0fca\0\u0183\0\u0ff5\0\u1020\0\u104b\0\u1076\0\u0183\0\u10a1"+
    "\0\u10cc\0\u10f7\0\u1122\0\u114d\0\u1178\0\u11a3\0\u11ce\0\u11f9"+
    "\0\u1224\0\u124f\0\u127a\0\u12a5\0\u078f\0\u0912\0\u12d0\0\u12fb"+
    "\0\u1326\0\u1351\0\u137c\0\u13a7\0\u13d2\0\u13fd\0\u0183\0\u1428"+
    "\0\u1453\0\u147e\0\u14a9\0\u14d4\0\u14ff\0\u152a\0\u1555\0\u0183"+
    "\0\u1580\0\u15ab\0\u15d6\0\u1601\0\u162c\0\u1657\0\u1682\0\u16ad"+
    "\0\u16d8\0\u1703\0\u172e\0\u1759\0\u1784\0\u17af\0\u17da\0\u1805"+
    "\0\u1830\0\u185b\0\u1886\0\u18b1\0\u18dc\0\u1907\0\u1932\0\u195d"+
    "\0\u1988\0\u19b3\0\u19de\0\u0183\0\u0183\0\u0183";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\12\1\13\5\12\1\14\1\12\1\15\3\12\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\2\12\1\24\2\12"+
    "\15\16\1\25\2\12\2\16\10\12\1\26\5\12\4\27"+
    "\1\12\1\23\3\12\1\30\1\12\15\27\3\12\2\27"+
    "\10\12\1\26\5\12\4\31\1\12\1\23\3\12\1\30"+
    "\1\12\15\31\3\12\2\31\1\12\7\32\1\33\5\32"+
    "\4\34\1\32\1\23\2\12\1\32\1\35\1\32\15\34"+
    "\3\32\1\36\1\34\2\32\1\37\5\32\1\33\5\32"+
    "\4\40\1\32\1\41\2\32\1\42\2\32\15\40\3\32"+
    "\2\40\10\32\1\33\5\32\4\43\1\32\1\41\2\32"+
    "\1\42\2\32\15\43\3\32\2\43\10\32\1\33\1\32"+
    "\1\44\3\32\4\45\1\32\1\41\5\32\15\45\3\32"+
    "\2\45\10\32\1\46\5\32\4\47\1\32\1\41\5\32"+
    "\15\47\1\32\1\50\1\32\2\47\1\32\1\51\1\52"+
    "\5\51\1\53\1\51\1\54\3\51\4\55\1\51\1\56"+
    "\2\51\1\57\2\51\15\55\2\51\1\60\2\55\1\51"+
    "\54\0\1\61\61\0\1\62\4\0\4\63\7\0\6\63"+
    "\1\64\6\63\3\0\2\63\12\0\1\65\42\0\1\66"+
    "\1\67\1\70\1\71\2\72\1\0\1\73\3\0\1\73"+
    "\1\16\1\17\1\20\1\21\7\0\15\16\3\0\2\16"+
    "\3\0\1\74\1\0\1\75\2\76\1\0\1\77\3\0"+
    "\1\77\3\17\1\21\7\0\15\17\3\0\2\17\2\0"+
    "\1\66\1\100\1\70\1\71\2\76\1\0\1\77\3\0"+
    "\1\77\1\20\1\17\1\20\1\21\7\0\15\20\3\0"+
    "\2\20\3\0\1\101\1\0\1\75\2\72\1\0\1\73"+
    "\3\0\1\73\4\21\7\0\15\21\3\0\2\21\24\0"+
    "\1\12\54\0\1\102\72\0\1\103\15\0\1\62\4\0"+
    "\4\63\7\0\15\63\3\0\2\63\16\0\4\27\7\0"+
    "\15\27\3\0\2\27\27\0\1\35\41\0\4\31\7\0"+
    "\15\31\3\0\2\31\16\0\4\34\7\0\15\34\3\0"+
    "\2\34\16\0\4\34\7\0\2\34\1\104\12\34\3\0"+
    "\2\34\2\0\1\105\66\0\4\40\7\0\15\40\3\0"+
    "\2\40\24\0\1\32\54\0\1\106\42\0\4\43\7\0"+
    "\15\43\3\0\2\43\12\0\1\35\56\0\4\45\7\0"+
    "\15\45\3\0\2\45\11\0\1\107\4\0\4\63\7\0"+
    "\15\63\3\0\2\63\16\0\4\47\7\0\15\47\3\0"+
    "\2\47\47\0\1\35\5\0\1\110\62\0\1\111\56\0"+
    "\4\55\7\0\15\55\3\0\2\55\24\0\1\51\54\0"+
    "\1\112\42\0\4\63\7\0\15\63\3\0\2\63\14\0"+
    "\1\32\1\0\4\113\1\0\3\114\3\0\15\113\3\0"+
    "\2\113\14\0\1\32\1\0\4\113\1\0\3\114\3\0"+
    "\3\113\1\115\11\113\3\0\2\113\16\0\1\116\1\0"+
    "\1\116\10\0\15\116\3\0\2\116\16\0\1\117\1\120"+
    "\1\121\1\122\7\0\15\117\3\0\2\117\16\0\1\123"+
    "\1\0\1\123\10\0\15\123\3\0\2\123\16\0\1\124"+
    "\1\125\1\124\1\125\7\0\15\124\3\0\2\124\16\0"+
    "\1\126\2\127\1\130\7\0\15\126\3\0\2\126\16\0"+
    "\1\73\2\131\10\0\15\73\3\0\2\73\16\0\1\132"+
    "\2\133\1\134\7\0\15\132\3\0\2\132\16\0\4\125"+
    "\7\0\15\125\3\0\2\125\16\0\1\135\2\136\1\137"+
    "\7\0\15\135\3\0\2\135\16\0\1\140\2\141\1\142"+
    "\7\0\15\140\3\0\2\140\16\0\1\143\1\133\1\144"+
    "\1\134\7\0\15\143\3\0\2\143\16\0\1\145\2\120"+
    "\1\122\7\0\15\145\3\0\2\145\30\0\1\146\1\147"+
    "\63\0\1\150\26\0\4\34\7\0\2\34\1\151\12\34"+
    "\3\0\2\34\2\0\1\152\100\0\1\153\1\154\37\0"+
    "\4\63\7\0\6\63\1\155\6\63\3\0\2\63\2\0"+
    "\1\156\62\0\1\157\70\0\1\160\1\161\33\0\1\162"+
    "\1\0\1\32\1\0\4\113\1\0\3\114\3\0\15\113"+
    "\3\0\2\113\16\0\4\163\1\0\3\114\3\0\15\163"+
    "\3\0\2\163\12\0\1\162\1\0\1\32\1\0\4\113"+
    "\1\0\3\114\3\0\10\113\1\164\4\113\3\0\2\113"+
    "\2\0\1\66\13\0\1\116\1\0\1\116\10\0\15\116"+
    "\3\0\2\116\3\0\1\165\1\0\1\75\2\166\6\0"+
    "\1\117\1\120\1\121\1\122\7\0\15\117\3\0\2\117"+
    "\3\0\1\167\1\0\1\75\2\170\1\0\1\171\3\0"+
    "\1\171\3\120\1\122\7\0\15\120\3\0\2\120\3\0"+
    "\1\172\1\0\1\75\2\170\1\0\1\171\3\0\1\171"+
    "\1\121\1\120\1\121\1\122\7\0\15\121\3\0\2\121"+
    "\3\0\1\173\1\0\1\75\2\166\6\0\4\122\7\0"+
    "\15\122\3\0\2\122\3\0\1\174\2\0\1\174\7\0"+
    "\1\124\1\125\1\124\1\125\7\0\15\124\3\0\2\124"+
    "\3\0\1\174\2\0\1\174\7\0\4\125\7\0\15\125"+
    "\3\0\2\125\3\0\1\166\1\0\1\75\2\166\6\0"+
    "\1\126\2\127\1\130\7\0\15\126\3\0\2\126\3\0"+
    "\1\170\1\0\1\75\2\170\1\0\1\171\3\0\1\171"+
    "\3\127\1\130\7\0\15\127\3\0\2\127\3\0\1\166"+
    "\1\0\1\75\2\166\6\0\4\130\7\0\15\130\3\0"+
    "\2\130\3\0\1\171\2\0\2\171\1\0\1\171\3\0"+
    "\1\171\3\131\10\0\15\131\3\0\2\131\3\0\1\101"+
    "\1\0\1\75\2\72\1\0\1\73\3\0\1\73\1\132"+
    "\2\133\1\134\7\0\15\132\3\0\2\132\3\0\1\74"+
    "\1\0\1\75\2\76\1\0\1\77\3\0\1\77\3\133"+
    "\1\134\7\0\15\133\3\0\2\133\3\0\1\101\1\0"+
    "\1\75\2\72\1\0\1\73\3\0\1\73\4\134\7\0"+
    "\15\134\3\0\2\134\3\0\1\72\1\0\1\75\2\72"+
    "\1\0\1\73\3\0\1\73\1\135\2\136\1\137\7\0"+
    "\15\135\3\0\2\135\3\0\1\76\1\0\1\75\2\76"+
    "\1\0\1\77\3\0\1\77\3\136\1\137\7\0\15\136"+
    "\3\0\2\136\3\0\1\72\1\0\1\75\2\72\1\0"+
    "\1\73\3\0\1\73\4\137\7\0\15\137\3\0\2\137"+
    "\3\0\1\73\2\0\2\73\1\0\1\73\3\0\1\73"+
    "\1\140\2\141\1\142\7\0\15\140\3\0\2\140\3\0"+
    "\1\77\2\0\2\77\1\0\1\77\3\0\1\77\3\141"+
    "\1\142\7\0\15\141\3\0\2\141\3\0\1\73\2\0"+
    "\2\73\1\0\1\73\3\0\1\73\4\142\7\0\15\142"+
    "\3\0\2\142\3\0\1\175\1\0\1\75\2\72\1\0"+
    "\1\73\3\0\1\73\1\143\1\133\1\144\1\134\7\0"+
    "\15\143\3\0\2\143\3\0\1\176\1\0\1\75\2\76"+
    "\1\0\1\77\3\0\1\77\1\144\1\133\1\144\1\134"+
    "\7\0\15\144\3\0\2\144\3\0\1\173\1\0\1\75"+
    "\2\166\6\0\1\145\2\120\1\122\7\0\15\145\3\0"+
    "\2\145\31\0\1\147\53\0\1\177\63\0\1\200\25\0"+
    "\4\34\7\0\15\34\3\0\1\34\1\201\31\0\1\154"+
    "\53\0\1\202\34\0\1\32\1\0\4\113\1\0\3\114"+
    "\3\0\3\113\1\203\11\113\3\0\2\113\2\0\1\204"+
    "\101\0\1\161\53\0\1\205\33\0\1\206\51\0\1\162"+
    "\3\0\4\163\7\0\15\163\3\0\2\163\12\0\1\162"+
    "\1\0\1\207\1\0\4\113\1\0\3\114\3\0\15\113"+
    "\3\0\2\113\16\0\1\210\1\122\1\210\1\122\7\0"+
    "\15\210\3\0\2\210\16\0\4\130\7\0\15\130\3\0"+
    "\2\130\16\0\4\134\7\0\15\134\3\0\2\134\16\0"+
    "\4\137\7\0\15\137\3\0\2\137\16\0\4\142\7\0"+
    "\15\142\3\0\2\142\16\0\1\211\1\134\1\211\1\134"+
    "\7\0\15\211\3\0\2\211\16\0\4\122\7\0\15\122"+
    "\3\0\2\122\16\0\4\212\7\0\15\212\3\0\2\212"+
    "\33\0\1\213\60\0\1\214\27\0\4\34\6\0\1\215"+
    "\15\34\3\0\2\34\33\0\1\216\31\0\1\162\1\0"+
    "\1\32\1\0\4\113\1\0\3\114\3\0\10\113\1\217"+
    "\4\113\3\0\2\113\2\0\1\220\103\0\1\221\35\0"+
    "\4\222\7\0\15\222\3\0\2\222\3\0\1\165\1\0"+
    "\1\75\2\166\6\0\1\210\1\122\1\210\1\122\7\0"+
    "\15\210\3\0\2\210\3\0\1\175\1\0\1\75\2\72"+
    "\1\0\1\73\3\0\1\73\1\211\1\134\1\211\1\134"+
    "\7\0\15\211\3\0\2\211\3\0\1\174\2\0\1\174"+
    "\7\0\4\212\7\0\15\212\3\0\2\212\34\0\1\223"+
    "\54\0\1\224\25\0\1\225\75\0\1\226\30\0\1\162"+
    "\1\0\1\35\1\0\4\113\1\0\3\114\3\0\15\113"+
    "\3\0\2\113\34\0\1\227\31\0\1\230\2\0\4\222"+
    "\7\0\15\222\3\0\2\222\35\0\1\231\61\0\1\232"+
    "\17\0\1\233\76\0\1\234\52\0\1\235\31\0\1\32"+
    "\1\0\4\163\1\0\3\114\3\0\15\163\3\0\2\163"+
    "\36\0\1\236\52\0\1\237\32\0\4\240\7\0\15\240"+
    "\3\0\2\240\36\0\1\241\52\0\1\242\53\0\1\243"+
    "\60\0\1\244\10\0\1\245\12\0\4\240\7\0\15\240"+
    "\3\0\2\240\37\0\1\246\52\0\1\247\53\0\1\250"+
    "\21\0\1\12\61\0\4\251\7\0\15\251\3\0\2\251"+
    "\40\0\1\252\52\0\1\253\42\0\1\254\25\0\2\251"+
    "\1\0\2\251\1\0\2\251\2\0\5\251\7\0\15\251"+
    "\3\0\3\251\27\0\1\255\52\0\1\256\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6665];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\11\0\1\11\7\1\1\11\7\1\1\11\2\1\1\11"+
    "\13\1\1\11\6\1\2\11\3\0\1\11\14\0\3\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\3\0\7\1"+
    "\2\0\1\1\1\0\15\1\3\0\1\1\1\11\3\0"+
    "\1\1\1\11\5\0\1\1\4\0\1\1\2\0\2\1"+
    "\2\0\1\1\5\0\1\11\3\1\5\0\1\11\30\0"+
    "\1\1\2\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */

public static final int ALPHANUM          = 0;
public static final int APOSTROPHE        = 1;
public static final int ACRONYM           = 2;
public static final int COMPANY           = 3;
public static final int EMAIL             = 4;
public static final int HOST              = 5;
public static final int NUM               = 6;
public static final int CJ                = 7;
public static final int INTERNAL_LINK     = 8;
public static final int EXTERNAL_LINK     = 9;
public static final int CITATION          = 10;
public static final int CATEGORY         = 11;
public static final int BOLD     = 12;
public static final int ITALICS     = 13;
public static final int BOLD_ITALICS     = 14;
public static final int HEADING     = 15;
public static final int SUB_HEADING     = 16;
public static final int EXTERNAL_LINK_URL = 17;


private int currentTokType;
private int numBalanced = 0;
private int positionInc = 1;

public static final String [] TOKEN_TYPES = new String [] {
    "<ALPHANUM>",
    "<APOSTROPHE>",
    "<ACRONYM>",
    "<COMPANY>",
    "<EMAIL>",
    "<HOST>",
    "<NUM>",
    "<CJ>",
    WikipediaTokenizer.INTERNAL_LINK,
    WikipediaTokenizer.EXTERNAL_LINK,
    WikipediaTokenizer.CITATION,
    WikipediaTokenizer.CATEGORY,
    WikipediaTokenizer.BOLD,
    WikipediaTokenizer.ITALICS,
    WikipediaTokenizer.BOLD_ITALICS,
    WikipediaTokenizer.HEADING,
    WikipediaTokenizer.SUB_HEADING,
    WikipediaTokenizer.EXTERNAL_LINK_URL
};

public final int yychar()
{
    return yychar;
}

public final int getPositionIncrement(){
  return positionInc;
}

/**
 * Fills Lucene token with the current token text.
 */
final void getText(Token t, int tokType) {
  t.setTermBuffer(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  WikipediaTokenizerImpl(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  WikipediaTokenizerImpl(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 230) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int getNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { /* ignore */
          }
        case 42: break;
        case 3: 
          { positionInc = 1; return CJ;
          }
        case 43: break;
        case 26: 
          { numBalanced = 0;currentTokType = ALPHANUM; yybegin(YYINITIAL);/*end italics*/
          }
        case 44: break;
        case 37: 
          { numBalanced = 0;currentTokType = ALPHANUM; yybegin(YYINITIAL);/*end bold italics*/
          }
        case 45: break;
        case 11: 
          { currentTokType = ITALICS; yybegin(STRING); return currentTokType;/*italics*/
          }
        case 46: break;
        case 5: 
          { yybegin(CATEGORY_STATE); return currentTokType;
          }
        case 47: break;
        case 34: 
          { numBalanced = 0;currentTokType = ALPHANUM; yybegin(YYINITIAL);/*end sub header*/
          }
        case 48: break;
        case 24: 
          { positionInc = 1; currentTokType = CITATION; yybegin(DOUBLE_BRACE_STATE);
          }
        case 49: break;
        case 22: 
          { positionInc = 1; yybegin(DOUBLE_EQUALS_STATE);
          }
        case 50: break;
        case 39: 
          { positionInc = 1; currentTokType = CATEGORY; yybegin(CATEGORY_STATE);
          }
        case 51: break;
        case 18: 
          { yybegin(STRING); return currentTokType;/* STRING ALPHANUM*/
          }
        case 52: break;
        case 21: 
          { positionInc = 1; if (numBalanced == 0){numBalanced++;yybegin(TWO_SINGLE_QUOTES_STATE);} else{numBalanced = 0;}
          }
        case 53: break;
        case 1: 
          { positionInc = 1;
          }
        case 54: break;
        case 41: 
          { numBalanced = 0;currentTokType = CATEGORY;yybegin(CATEGORY_STATE);
          }
        case 55: break;
        case 9: 
          { yybegin(YYINITIAL);
          }
        case 56: break;
        case 19: 
          { numBalanced = 0;currentTokType = EXTERNAL_LINK;yybegin(EXTERNAL_LINK_STATE);
          }
        case 57: break;
        case 13: 
          { yybegin(STRING);return currentTokType;
          }
        case 58: break;
        case 36: 
          { positionInc = 1; return EMAIL;
          }
        case 59: break;
        case 35: 
          { positionInc = 1; return ACRONYM;
          }
        case 60: break;
        case 4: 
          { positionInc = 1;currentTokType = EXTERNAL_LINK_URL; yybegin(EXTERNAL_LINK_STATE);
          }
        case 61: break;
        case 17: 
          { /* ignore STRING */
          }
        case 62: break;
        case 40: 
          { currentTokType = CATEGORY;yybegin(CATEGORY_STATE);
          }
        case 63: break;
        case 20: 
          { yybegin(STRING); return currentTokType;/*pipe*/
          }
        case 64: break;
        case 12: 
          { currentTokType = EXTERNAL_LINK;yybegin(EXTERNAL_LINK_STATE);
          }
        case 65: break;
        case 27: 
          { numBalanced = 0;currentTokType = INTERNAL_LINK;yybegin(INTERNAL_LINK_STATE);
          }
        case 66: break;
        case 33: 
          { numBalanced = 0;currentTokType = ALPHANUM;yybegin(YYINITIAL);/*end bold*/
          }
        case 67: break;
        case 16: 
          { yybegin(DOUBLE_BRACE_STATE); return currentTokType;
          }
        case 68: break;
        case 29: 
          { positionInc = 1; return HOST;
          }
        case 69: break;
        case 32: 
          { currentTokType = BOLD_ITALICS;  yybegin(FIVE_SINGLE_QUOTES_STATE);
          }
        case 70: break;
        case 25: 
          { currentTokType = INTERNAL_LINK;yybegin(INTERNAL_LINK_STATE);
          }
        case 71: break;
        case 23: 
          { positionInc = 0; currentTokType = INTERNAL_LINK; yybegin(INTERNAL_LINK_STATE);
          }
        case 72: break;
        case 14: 
          { currentTokType = SUB_HEADING; yybegin(STRING);
          }
        case 73: break;
        case 28: 
          { positionInc = 1; return APOSTROPHE;
          }
        case 74: break;
        case 30: 
          { positionInc = 1; return NUM;
          }
        case 75: break;
        case 15: 
          { currentTokType = HEADING; yybegin(DOUBLE_EQUALS_STATE); return currentTokType;
          }
        case 76: break;
        case 6: 
          { yybegin(INTERNAL_LINK_STATE); return currentTokType;
          }
        case 77: break;
        case 2: 
          { positionInc = 1; return ALPHANUM;
          }
        case 78: break;
        case 31: 
          { positionInc = 1; return COMPANY;
          }
        case 79: break;
        case 10: 
          { currentTokType = BOLD;  yybegin(THREE_SINGLE_QUOTES_STATE);
          }
        case 80: break;
        case 8: 
          { positionInc = 1; currentTokType = EXTERNAL_LINK; yybegin(EXTERNAL_LINK_STATE);return currentTokType;
          }
        case 81: break;
        case 38: 
          { positionInc = 0; yybegin(EXTERNAL_LINK_STATE); return currentTokType;
          }
        case 82: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
