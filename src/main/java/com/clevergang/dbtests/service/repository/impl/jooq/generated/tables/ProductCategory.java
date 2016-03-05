/**
 * This class is generated by jOOQ
 */
package com.clevergang.dbtests.service.repository.impl.jooq.generated.tables;


import com.clevergang.dbtests.service.repository.impl.jooq.generated.Keys;
import com.clevergang.dbtests.service.repository.impl.jooq.generated.Public;
import com.clevergang.dbtests.service.repository.impl.jooq.generated.tables.records.ProductCategoryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductCategory extends TableImpl<ProductCategoryRecord> {

	private static final long serialVersionUID = -1673587195;

	/**
	 * The reference instance of <code>public.product_category</code>
	 */
	public static final ProductCategory PRODUCT_CATEGORY = new ProductCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProductCategoryRecord> getRecordType() {
		return ProductCategoryRecord.class;
	}

	/**
	 * The column <code>public.product_category.pid</code>.
	 */
	public final TableField<ProductCategoryRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.product_category.category</code>.
	 */
	public final TableField<ProductCategoryRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

	/**
	 * Create a <code>public.product_category</code> table reference
	 */
	public ProductCategory() {
		this("product_category", null);
	}

	/**
	 * Create an aliased <code>public.product_category</code> table reference
	 */
	public ProductCategory(String alias) {
		this(alias, PRODUCT_CATEGORY);
	}

	private ProductCategory(String alias, Table<ProductCategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProductCategory(String alias, Table<ProductCategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProductCategoryRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PRODUCT_CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProductCategoryRecord> getPrimaryKey() {
		return Keys.PRODUCT_CATEGORY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProductCategoryRecord>> getKeys() {
		return Arrays.<UniqueKey<ProductCategoryRecord>>asList(Keys.PRODUCT_CATEGORY_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductCategory as(String alias) {
		return new ProductCategory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProductCategory rename(String name) {
		return new ProductCategory(name, null);
	}
}