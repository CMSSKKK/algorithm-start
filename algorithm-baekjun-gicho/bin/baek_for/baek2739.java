����   ; L  baek_for/baek2739  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lbaek_for/baek2739; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I	    ! " out Ljava/io/PrintStream; $ java/lang/StringBuilder
 & ( ' java/lang/String ) * valueOf (I)Ljava/lang/String;
 # ,  - (Ljava/lang/String;)V /  * 
 # 1 2 3 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # 5 2 6 (I)Ljava/lang/StringBuilder; 8  = 
 # : ; < toString ()Ljava/lang/String;
 > @ ? java/io/PrintStream A - println args [Ljava/lang/String; sc Ljava/util/Scanner; N I i StackMapTable 
SourceFile baek2739.java !               /     *� �    
                    	       �     G� Y� � L+� =>� .� � #Y� %� +.� 0� 47� 0h� 4� 9� =�
��ұ    
       	  
     =  F     *    G B C    < D E   7 F G   4 H G  I    �  *  J    K