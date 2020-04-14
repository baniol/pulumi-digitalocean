// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a DigitalOcean database connection pool resource.
type DatabaseConnectionPool struct {
	pulumi.CustomResourceState

	// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The database for use with the connection pool.
	DbName pulumi.StringOutput `pulumi:"dbName"`
	// The hostname used to connect to the database connection pool.
	Host pulumi.StringOutput `pulumi:"host"`
	// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The name for the database connection pool.
	Name pulumi.StringOutput `pulumi:"name"`
	// Password for the connection pool's user.
	Password pulumi.StringOutput `pulumi:"password"`
	// Network port that the database connection pool is listening on.
	Port pulumi.IntOutput `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost pulumi.StringOutput `pulumi:"privateHost"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri pulumi.StringOutput `pulumi:"privateUri"`
	// The desired size of the PGBouncer connection pool.
	Size pulumi.IntOutput `pulumi:"size"`
	// The full URI for connecting to the database connection pool.
	Uri pulumi.StringOutput `pulumi:"uri"`
	// The name of the database user for use with the connection pool.
	User pulumi.StringOutput `pulumi:"user"`
}

// NewDatabaseConnectionPool registers a new resource with the given unique name, arguments, and options.
func NewDatabaseConnectionPool(ctx *pulumi.Context,
	name string, args *DatabaseConnectionPoolArgs, opts ...pulumi.ResourceOption) (*DatabaseConnectionPool, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.DbName == nil {
		return nil, errors.New("missing required argument 'DbName'")
	}
	if args == nil || args.Mode == nil {
		return nil, errors.New("missing required argument 'Mode'")
	}
	if args == nil || args.Size == nil {
		return nil, errors.New("missing required argument 'Size'")
	}
	if args == nil || args.User == nil {
		return nil, errors.New("missing required argument 'User'")
	}
	if args == nil {
		args = &DatabaseConnectionPoolArgs{}
	}
	var resource DatabaseConnectionPool
	err := ctx.RegisterResource("digitalocean:index/databaseConnectionPool:DatabaseConnectionPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseConnectionPool gets an existing DatabaseConnectionPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseConnectionPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseConnectionPoolState, opts ...pulumi.ResourceOption) (*DatabaseConnectionPool, error) {
	var resource DatabaseConnectionPool
	err := ctx.ReadResource("digitalocean:index/databaseConnectionPool:DatabaseConnectionPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseConnectionPool resources.
type databaseConnectionPoolState struct {
	// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
	ClusterId *string `pulumi:"clusterId"`
	// The database for use with the connection pool.
	DbName *string `pulumi:"dbName"`
	// The hostname used to connect to the database connection pool.
	Host *string `pulumi:"host"`
	// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
	Mode *string `pulumi:"mode"`
	// The name for the database connection pool.
	Name *string `pulumi:"name"`
	// Password for the connection pool's user.
	Password *string `pulumi:"password"`
	// Network port that the database connection pool is listening on.
	Port *int `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost *string `pulumi:"privateHost"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri *string `pulumi:"privateUri"`
	// The desired size of the PGBouncer connection pool.
	Size *int `pulumi:"size"`
	// The full URI for connecting to the database connection pool.
	Uri *string `pulumi:"uri"`
	// The name of the database user for use with the connection pool.
	User *string `pulumi:"user"`
}

type DatabaseConnectionPoolState struct {
	// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
	ClusterId pulumi.StringPtrInput
	// The database for use with the connection pool.
	DbName pulumi.StringPtrInput
	// The hostname used to connect to the database connection pool.
	Host pulumi.StringPtrInput
	// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
	Mode pulumi.StringPtrInput
	// The name for the database connection pool.
	Name pulumi.StringPtrInput
	// Password for the connection pool's user.
	Password pulumi.StringPtrInput
	// Network port that the database connection pool is listening on.
	Port pulumi.IntPtrInput
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost pulumi.StringPtrInput
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri pulumi.StringPtrInput
	// The desired size of the PGBouncer connection pool.
	Size pulumi.IntPtrInput
	// The full URI for connecting to the database connection pool.
	Uri pulumi.StringPtrInput
	// The name of the database user for use with the connection pool.
	User pulumi.StringPtrInput
}

func (DatabaseConnectionPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseConnectionPoolState)(nil)).Elem()
}

type databaseConnectionPoolArgs struct {
	// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
	ClusterId string `pulumi:"clusterId"`
	// The database for use with the connection pool.
	DbName string `pulumi:"dbName"`
	// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
	Mode string `pulumi:"mode"`
	// The name for the database connection pool.
	Name *string `pulumi:"name"`
	// The desired size of the PGBouncer connection pool.
	Size int `pulumi:"size"`
	// The name of the database user for use with the connection pool.
	User string `pulumi:"user"`
}

// The set of arguments for constructing a DatabaseConnectionPool resource.
type DatabaseConnectionPoolArgs struct {
	// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
	ClusterId pulumi.StringInput
	// The database for use with the connection pool.
	DbName pulumi.StringInput
	// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
	Mode pulumi.StringInput
	// The name for the database connection pool.
	Name pulumi.StringPtrInput
	// The desired size of the PGBouncer connection pool.
	Size pulumi.IntInput
	// The name of the database user for use with the connection pool.
	User pulumi.StringInput
}

func (DatabaseConnectionPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseConnectionPoolArgs)(nil)).Elem()
}
