package tables
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends Tables {
  val profile = slick.jdbc.MySQLProfile
}

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.)
    Each generated XXXXTable trait is mixed in this trait hence allowing access to all the TableQuery lazy vals.
  */
trait Tables extends TablesRoot with DatabasechangeloglockTable with EventsStatementsSummaryGlobalByEventNameTable with ColumnStatsTable with EventsStagesSummaryByAccountByEventNameTable with BookStoreTable with WpLinksTable with TransactionRegistryTable with Pma_ExportTemplatesTable with EventsStatementsSummaryByDigestTable with TimeZoneTransitionTable with HelpCategoryTable with WpRedirectionLogsTable with HelpTopicTable with AuthorTable with Pma_SavedsearchesTable with WpWprssLogsTable with TablesPrivTable with ThreadsTable with FileSummaryByInstanceTable with EventsStagesHistoryTable with PerformanceTimersTable with EventsStagesSummaryGlobalByEventNameTable with Pma_FavoriteTable with SocketSummaryByEventNameTable with RuntimeappconfigTable with Pma_UsergroupsTable with EventsWaitsSummaryByInstanceTable with SetupInstrumentsTable with SetupTimersTable with EventsWaitsSummaryByHostByEventNameTable with AccountsTable with WpCommentsTable with TimeZoneNameTable with EventsWaitsSummaryByThreadByEventNameTable with SlowLogTable with SetupConsumersTable with TimeZoneTable with RwlockInstancesTable with FuncTable with GeneralLogTable with WpYoastSeoLinksTable with Pma_NavigationhidingTable with ClientTable with EventsStatementsCurrentTable with PlayEvolutionsTable with EventsWaitsHistoryTable with WpOptionsTable with TableLockWaitsSummaryByTableTable with WpYoastIndexableHierarchyTable with ObjectsSummaryGlobalByTypeTable with EventsWaitsHistoryLongTable with WpAccordeonmenuckStylesTable with Pma_PdfPagesTable with HostsTable with EventsStatementsSummaryByHostByEventNameTable with EventsStagesSummaryByUserByEventNameTable with Pma_UserconfigTable with SocketInstancesTable with WpRedirection404Table with ArtistsTable with WpPostmetaTable with WpPostsTable with EventsStagesSummaryByThreadByEventNameTable with MutexInstancesTable with ProcTable with WpTermRelationshipsTable with TableIoWaitsSummaryByTableTable with WpUsersTable with InnodbTableStatsTable with Pma_CentralColumnsTable with WpYoastPrimaryTermTable with EventsStagesCurrentTable with UserRoleTable with WpTermsTable with UserTable with InnodbIndexStatsTable with GtidSlavePosTable with BookTable with WpTermTaxonomyTable with Pma_UsersTable with HostCacheTable with DbTable with LanguageTable with BookToBookStoreTable with Pma_TableInfoTable with TimeZoneTransitionTypeTable with UsersTable with EventsStatementsSummaryByAccountByEventNameTable with EventTable with TableIoWaitsSummaryByIndexUsageTable with IndexStatsTable with Tester2Table with WpCommentmetaTable with TracksTable with Pma_TableCoordsTable with EventsStatementsSummaryByUserByEventNameTable with ServersTable with SessionAccountConnectAttrsTable with SetupActorsTable with WpRedirectionItemsTable with EventsWaitsSummaryGlobalByEventNameTable with RoleTable with HelpKeywordTable with SocketSummaryByInstanceTable with EventsWaitsCurrentTable with TesterTable with CondInstancesTable with WpYoastSeoMetaTable with LangTable with EventsStatementsHistoryTable with Pma_TrackingTable with Pma_RelationTable with Pma_DesignerSettingsTable with WpYoastIndexableTable with GlobalPrivTable with SetupObjectsTable with EventsStagesSummaryByHostByEventNameTable with FileSummaryByEventNameTable with FlywaySchemaHistoryTable with EventsWaitsSummaryByAccountByEventNameTable with EventsStatementsHistoryLongTable with EventsStagesHistoryLongTable with Pma_HistoryTable with WpYoastMigrationsTable with SessionConnectAttrsTable with ProcsPrivTable with TableStatsTable with PluginTable with EventsStatementsSummaryByThreadByEventNameTable with FileInstancesTable with Pma_BookmarkTable with TimeZoneLeapSecondTable with ColumnsPrivTable with WpQuotescollectionTable with ProxiesPrivTable with Pma_RecentTable with DatabasechangelogTable with WpUsermetaTable with WpTermmetaTable with HelpRelationTable with Pma_ColumnInfoTable with Pma_TableUiprefsTable with EventsWaitsSummaryByUserByEventNameTable with WpRedirectionGroupsTable with ProductLangTable with ProductTable with RolesMappingTable {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(Accounts.schema, Artists.schema, Author.schema, Author.schema, Book.schema, Book.schema, BookStore.schema, BookStore.schema, BookToBookStore.schema, BookToBookStore.schema, Client.schema, Client.schema, ColumnsPriv.schema, ColumnStats.schema, CondInstances.schema, Databasechangelog.schema, Databasechangeloglock.schema, Db.schema, Event.schema, EventsStagesCurrent.schema, EventsStagesHistory.schema, EventsStagesHistoryLong.schema, EventsStagesSummaryByAccountByEventName.schema, EventsStagesSummaryByHostByEventName.schema, EventsStagesSummaryByThreadByEventName.schema, EventsStagesSummaryByUserByEventName.schema, EventsStagesSummaryGlobalByEventName.schema, EventsStatementsCurrent.schema, EventsStatementsHistory.schema, EventsStatementsHistoryLong.schema, EventsStatementsSummaryByAccountByEventName.schema, EventsStatementsSummaryByDigest.schema, EventsStatementsSummaryByHostByEventName.schema, EventsStatementsSummaryByThreadByEventName.schema, EventsStatementsSummaryByUserByEventName.schema, EventsStatementsSummaryGlobalByEventName.schema, EventsWaitsCurrent.schema, EventsWaitsHistory.schema, EventsWaitsHistoryLong.schema, EventsWaitsSummaryByAccountByEventName.schema, EventsWaitsSummaryByHostByEventName.schema, EventsWaitsSummaryByInstance.schema, EventsWaitsSummaryByThreadByEventName.schema, EventsWaitsSummaryByUserByEventName.schema, EventsWaitsSummaryGlobalByEventName.schema, FileInstances.schema, FileSummaryByEventName.schema, FileSummaryByInstance.schema, FlywaySchemaHistory.schema, FlywaySchemaHistory.schema, Func.schema, GeneralLog.schema, GlobalPriv.schema, GtidSlavePos.schema, HelpCategory.schema, HelpKeyword.schema, HelpRelation.schema, HelpTopic.schema, HostCache.schema, Hosts.schema, IndexStats.schema, InnodbIndexStats.schema, InnodbTableStats.schema, Lang.schema, Lang.schema, Lang.schema, Language.schema, Language.schema, MutexInstances.schema, ObjectsSummaryGlobalByType.schema, PerformanceTimers.schema, PlayEvolutions.schema, Plugin.schema, Pma_Bookmark.schema, Pma_CentralColumns.schema, Pma_ColumnInfo.schema, Pma_DesignerSettings.schema, Pma_ExportTemplates.schema, Pma_Favorite.schema, Pma_History.schema, Pma_Navigationhiding.schema, Pma_PdfPages.schema, Pma_Recent.schema, Pma_Relation.schema, Pma_Savedsearches.schema, Pma_TableCoords.schema, Pma_TableInfo.schema, Pma_TableUiprefs.schema, Pma_Tracking.schema, Pma_Userconfig.schema, Pma_Usergroups.schema, Pma_Users.schema, Proc.schema, ProcsPriv.schema, Product.schema, Product.schema, Product.schema, ProductLang.schema, ProductLang.schema, ProductLang.schema, ProxiesPriv.schema, Role.schema, Role.schema, RolesMapping.schema, Runtimeappconfig.schema, RwlockInstances.schema, Servers.schema, SessionAccountConnectAttrs.schema, SessionConnectAttrs.schema, SetupActors.schema, SetupConsumers.schema, SetupInstruments.schema, SetupObjects.schema, SetupTimers.schema, SlowLog.schema, SocketInstances.schema, SocketSummaryByEventName.schema, SocketSummaryByInstance.schema, TableIoWaitsSummaryByIndexUsage.schema, TableIoWaitsSummaryByTable.schema, TableLockWaitsSummaryByTable.schema, TablesPriv.schema, TableStats.schema, Tester.schema, Tester2.schema, Threads.schema, TimeZone.schema, TimeZoneLeapSecond.schema, TimeZoneName.schema, TimeZoneTransition.schema, TimeZoneTransitionType.schema, Tracks.schema, TransactionRegistry.schema, User.schema, User.schema, User.schema, UserRole.schema, UserRole.schema, Users.schema, WpAccordeonmenuckStyles.schema, WpCommentmeta.schema, WpComments.schema, WpLinks.schema, WpOptions.schema, WpPostmeta.schema, WpPosts.schema, WpQuotescollection.schema, WpRedirection404.schema, WpRedirectionGroups.schema, WpRedirectionItems.schema, WpRedirectionLogs.schema, WpTermmeta.schema, WpTermRelationships.schema, WpTerms.schema, WpTermTaxonomy.schema, WpUsermeta.schema, WpUsers.schema, WpWprssLogs.schema, WpYoastIndexable.schema, WpYoastIndexableHierarchy.schema, WpYoastMigrations.schema, WpYoastPrimaryTerm.schema, WpYoastSeoLinks.schema, WpYoastSeoMeta.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

}
