����   4 �  exercices/testeCalculadora  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lexercices/testeCalculadora; main ([Ljava/lang/String;)V	    java/math/BigInteger   ZERO Ljava/math/BigInteger;  exercices/calculadora
     (Ljava/math/BigInteger;)V
     opcoes E(Lexercices/calculadora;Ljava/math/BigInteger;)Ljava/math/BigInteger;	   " ! java/lang/System # $ out Ljava/io/PrintStream; & java/lang/StringBuilder ( o Resultado é: 
 % *  + (Ljava/lang/String;)V
 % - . / append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 % 1 2 3 toString ()Ljava/lang/String;
 5 7 6 java/io/PrintStream 8 + println args [Ljava/lang/String; valorInicial result sair I calc Lexercices/calculadora; StackMapTable : soma
  E F G 	compareTo (Ljava/math/BigInteger;)I I informe um valor 
  K L M 	validaNum ()Ljava/math/BigInteger; O informe um segundo valor valor 
  Q C R D(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger; T 6Deseja somar mais uma vez? 0 para sim e 1 para não 
 
  V W X recebeOpcao ()I
  Z C  \ Digite um número 
 
  ^ _  mult a O valor atual é num somar val1 val2 val3 compare subtr
  j k R subtrai m 9Deseja subtrair mais uma vez? 0 para sim e 1 para não 
 
  o h  sub
  r s R 
multiplica u <Deseja multiplicar mais uma vez? 0 para sim e 1 para não 
  multipli divi y informe um segundo valor 
  { | R dividir ~ 8Deseja dividir mais uma vez? 0 para sim e 1 para não 
 
  � w 
  � � X intValue � O valor atual é : dividi val4 poten
  � � � potenciacao /(Ljava/math/BigInteger;I)Ljava/math/BigInteger; � IDeseja realizar a potenciação mais uma vez? 0 para sim e 1 para não 
 
  � �  potencia � java/util/Scanner	   � � � in Ljava/io/InputStream;
 � �  � (Ljava/io/InputStream;)V
 � � � � hasNextBigInteger ()Z
 � � � 3 next � 0Você deve digitar um valor que seja um numero: 
 � � � M nextBigInteger ler Ljava/util/Scanner; val
 � � � � 
hasNextInt
 � � � X nextInt �  Voce deve digitar ou 0 ou 1. valor recebeOp � Você deve digitar um número  op outFunc �  Você deve digitar uma palavra! 
  � � 3
 � � � 3 nextLine
 � � � java/lang/String � 3 toUpperCase � SIM
 � � � � equals (Ljava/lang/Object;)Z � NÃO �  Você deve digitar sim ou não!  Ljava/lang/String; exibeOpcoes � �
 1 Realiza peração de soma .
 2 Realiza operação de subtração 
 3 Realiza operação de multiplicação 
 4 Realiza operação de divisão 
 5 Realiza operação de potenciação 
 6- Finaliza o programa
  � � 
  � � X � !
 Deseja sair? Digite Sim ou não � -
 Deseja sair do programa? Digite Sim ou não 
calculator 
firstValue value valueF opcao 
SourceFile testeCalculadora.java !               /     *� �    
                    	       �     >� L� N6� � Y+� :+� N6��� � %Y'� )-� ,� 0� 4�    
   & 	     	  
       " 
 '  =     4    > 9 :    : ;    6 <    3 = >   
 ? @  A    �   B      
 C     �     �M� N6-+� D6� s� A� H� 4� J:� N� 4� J:*� PM� S� 4� U6� >*,� YW� 0� [� 4� J:*+� PM� S� 4� U6� 	*,� ]W���� � %Y`� ),� ,� 0� 4,�    
   f       	           %  -  2  ;  C  H  M  S # V % ^ & c ' k ( s ) x * } + �  � / � 0    \ 	   � ? @     � b    � c    � d   % 1 e   c   e   2 $ f   	 � = >   � g >  A    �          � B, 
 h     �     �M� N6-+� D6� s� A� H� 4� J:� N� 4� J:*� iM� l� 4� U6� >*,� nW� 0� [� 4� J:*+� iM� l� 4� U6� 	*,� ]W���� � %Y`� ),� ,� 0� 4,�    
   f    4  5 	 6  7  8  9   : % ; - < 2 = ; > C ? H @ M A S E V G ^ H c I k J s K x L } M � 7 � Q � R    \ 	   � ? @     � b    � p    � d   % 1 e   c   e   2 $ f   	 � = >   � g >  A    �          � B, 
 _     �     �M� N6-+� D6� s� A� H� 4� J:� N� 4� J:*� qM� t� 4� U6� >*,� ]W� 0� [� 4� J:*+� qM� t� 4� U6� 	*,� ]W���� � %Y`� ),� ,� 0� 4,�    
   f    V  W 	 X  Y  Z  [   \ % ] - ^ 2 _ ; ` C a H b M c S g V i ^ j c k k l s m x n } o � Y � s � t    \ 	   � ? @     � b    � v    � d   % 1 e   c   e   2 $ f   	 � = >   � g >  A    �          � B, 
 w     �  	   �M� N6-+� D6� �� A� H� 4� J:� x� 4� J:*� zM� }� 4� U6� P*,� W� B� [� 4� J:� �6� 	*,� W*+� zM� }� 4� U6� 	*,� W��|� � %Y�� ),� ,� 0� 4,�    
   r    y  z 	 {  |  }  ~    % � - � 2 � ; � C � H � M � S � V � ^ � c � j � o � u � } � � � � � � � � | � � � �    f 
   � ? @     � b    � �    � d   % 1 e   c 2 e   2 $ f   	 � = >   � g >  j + � >  A   N �          � B�  	        �           
 �     �  	   �M� N66-+� D6� �� H� H� 4� J:� N� 4� J:� �6*� �M� �� 4� U6� E*,� �W� 7� [� 4� J:� �6*+� �M� �� 4� U6� 	*,� �W���� � %Y�� ),� ,� 0� 4,�    
   n    �  �  �  �  �  � # � ( � 0 � 5 � < � E � M � R � W � ] � ` � h � m � t � | � � � � � � � � � � � � �    f 
   � ? @     � b    � �    � d   ( 8 e   m ' e   5 + f   	 � = >   � � >   � g >  A    �  	        � I3 
 L M     �     *� �Y� �� �K*� �� *� �W� �� 4� J�*� �L+�    
       �  �  �  �  � # � ( �        � �   (  �   A    � # � 
 W X     �     ?� �Y� �� �K*� �� *� �W� �� 4� U�*� �<� � � �� 4� U��    
   * 
   �  �  �  �  � # � ( � 1 � 9 � = �       4 � �   (  � >  A    � # ��  
 � X     �     )� �Y� �� �K� *� �W� �� 4*� ����*� �<�    
       �  �  �  �  � " � ' �        � �   '  � >  A   	 �  � 
 � 3     �     M� �Y� �� �K*� �� *� �W� �� 4� ��*� �L+� �L+Ķ ƚ +ʶ ƚ � ̶ 4� ��+�    
   .    �  �  �  �  � # � ( � - � ? � G � K �       B � �   ( % # �  A    � # �� ' � 
 �      -      	� ж 4�    
   
    �  �       
      T    +MN*:�:ʶ ƙ �� Ҹ �6�   �         %   O   y   �   �   �,� YM,N� ֶ 4� �:ʶ ƙ �,� W� �,� nM,N� ض 4� �:ʶ ƙ �,� W� {,� ]M� ֶ 4� �:ʶ ƙ ],� W� S,� M� ֶ 4� �:ʶ ƙ 5,� W� +,� �M� ֶ 4� �:ʶ ƙ ,� W� ,�    
   � (   �  �  �      D K M U Z	 d
 k n u w  � � � � � � � � � � �  �! �" �# �% �' �( �) �*+-3    H    � @     �    �    �    ? @   � � >   = �  A   : � D       �  ))''� '        �    �    �