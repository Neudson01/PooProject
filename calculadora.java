����   4 M  exercices/calculadora  java/lang/Object valor Ljava/math/BigInteger; <init> (Ljava/math/BigInteger;)V Code
     ()V	    java/math/BigInteger   ZERO	     LineNumberTable LocalVariableTable this Lexercices/calculadora; val soma D(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
     add .(Ljava/math/BigInteger;)Ljava/math/BigInteger; sum1 sum2 subtrai
  # $  subtract sub1 sub2 
multiplica
  ) *  multiply mult1 mult2 dividir
  / 0  divide div1 div2 potenciacao /(Ljava/math/BigInteger;I)Ljava/math/BigInteger;
  6 7 8 pow (I)Ljava/math/BigInteger; base poten I toString ()Ljava/lang/String; ? java/lang/StringBuilder A valor 
 > C  D (Ljava/lang/String;)V
 > F G H append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 > J < = 
SourceFile calculadora.java !                	   Q     *� 
*� � *+� �           	    
                         	   P     *+,� � *� �       
     	                             !   	   P     *+,� "� *� �       
     	                  %      &    '   	   P     *+,� (� *� �       
     	                  +      ,    -   	   P     *+,� .� *� �       
     	                  1      2    3 4  	   P     *+� 5� *� �       
     	                   9      : ;   < =  	   >     � >Y@� B*� � E� I�           #              K    L