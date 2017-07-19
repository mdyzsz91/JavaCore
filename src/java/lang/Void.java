/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

/**
 * The {@code Void} class is an uninstantiable placeholder class to hold a
 * reference to the {@code Class} object representing the Java keyword
 * void.
 *Void类是一个不可实例化的占位符类，它持有一个 代表Java关键字void的Class对象的引用。
 * final表明这个类是不允许被其他类继承的。
 * @author  unascribed
 * @since   JDK1.1
 */
public final
class Void {

    /**
     * The {@code Class} object representing 代表 the pseudo-type 伪-类型 corresponding 相应的 to
     * the keyword {@code void}.
     * 这是一个与关键字void一致的伪类型对象。
     * 获取void类型的字节码，将其引用赋值给Void类的TYPE属性。表名这是一个void关键字的Class对象。
     */
    @SuppressWarnings("unchecked")
    public static final Class<Void> TYPE = (Class<Void>) Class.getPrimitiveClass("void");//原始的


    /*
     * The Void class cannot be instantiated.
     * 构造函数使用private修饰符，表明这个类不能被实例化。
     */
    private Void() {}
}
