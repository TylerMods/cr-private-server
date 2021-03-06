package royaleserver.database.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "assets")
@NamedQuery(name = "AssetEntity.byName", query = "SELECT assetEntity FROM AssetEntity assetEntity WHERE assetEntity.name = :name")
public class AssetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 128, unique = true, nullable = false)
	private String name;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date lastUpdated;

	public long getId() {
		return id;
	}

	public AssetEntity setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public AssetEntity setName(String name) {
		this.name = name;
		return this;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public AssetEntity setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
		return this;
	}
}
