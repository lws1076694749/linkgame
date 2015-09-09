/**
 *
 */
package com.example.lenovo.linkgame.view;

import android.graphics.Bitmap;

/**
 * Description: 封装图片ID与图片本身的工具类
 */
public class PieceImage
{
	private Bitmap image;
	private int imageId;
	// 有参数的构造器
	public PieceImage(Bitmap image, int imageId)
	{
		super();
		this.image = image;
		this.imageId = imageId;
	}
	public Bitmap getImage()
	{
		return image;
	}
	public void setImage(Bitmap image)
	{
		this.image = image;
	}
	public int getImageId()
	{
		return imageId;
	}
	public void setImageId(int imageId)
	{
		this.imageId = imageId;
	}
}
