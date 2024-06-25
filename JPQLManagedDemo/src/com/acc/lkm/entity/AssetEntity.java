package com.acc.lkm.entity;

import javax.persistence.*;

@Entity
@Table(name="Assets")
public class AssetEntity {
	public AssetEntity() {
		super();
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer assetId;
    @Column(name="asset_name")
	private String assetName;
    @Column(name="AssetBrand")
	private String assetBrandName;
	private Integer validity;

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetBrandName() {
		return assetBrandName;
	}

	public void setAssetBrandName(String assetBrandName) {
		this.assetBrandName = assetBrandName;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

}
